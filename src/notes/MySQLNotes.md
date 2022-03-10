# MySQL Notes
<hr>
MySQL is a Relational Database Management System, or RDBMS. This means it stores data in tables and creates relationships between the data in the different tables. This is much like having multiple spreadsheets and having the data from one sheet use data from another. We use the Structured Query Language (SQL) to interact with MySQL. SQL is made up of statements and commands sent to the server individually, with results sent back to the client.

MySQL's commands are divided into several different categories:

       - Data Definition Language (DDL) refers to the CREATE, ALTER and DROP statements.
       - Data Manipulation Language (DML) refers to the INSERT, UPDATE and DELETE statements
       - Data Query Language (DQL) refers to the SELECT, SHOW and HELP statements (queries)
       - Data Control Language (DCL) refers to the GRANT and REVOKE statements
       - Data Transaction Language (DTL) refers to the START TRANSACTION, SAVEPOINT, COMMIT and ROLLBACK [TO SAVEPOINT] statements

## Starting Server
<hr>
In a production setup the database will be setup to run automatically, but for out purposes we'll need to start and stop MySQL ourselves.
Whenever you see an error that references communicating with the database, one of the first things you should do is make sure the MySQL server is running.
    
    mysql.server status
    mysql.server start
    mysql.server stop

MySQL stores information in a series of files, but we will virtually never look at or manipulate those files directly. Instead, we need some sort of interface for interacting with the data they contain.

There are actually two parts to MySQL we will be using. There is the underlying <strong>MySQL server</strong> that understands Structured Query Language (SQL) commands, stores and organizes the data on disk, and users that can connect and manipulate the data. 
    
To interact with the server, there is the <strong>MySQL client</strong> that connects to the server for us, sends our commands to the server, and displays the data on screen.

To connect to the sever, via the client:

    mysql -u USERNAME -p
    (currently setup as root (username) and codeup (password)


## Displaying Information
<hr>
Most of our output from MySQL will be formatted in a table. SQL commands are terminated with a ;. However, we can actually use a different combination of characters as a terminator: \G will display the rows individually.

    pager less -~SFX
This will tell MySQL to use a pager for output. Specifically, we will specify the pager program named less. A pager is a terminal program designed to handle multiple pages of output. You can use the arrow keys to move around the display, and the space bar to jump to the next page of results. In addition, you can use the following keys to navigate in less:

    d: go down a half page
    u: go up a half page
    j: scroll down one line
    k: scroll up one line
    /: search for a term

Regardless of how you navigate, press q to exit the pager. Remove the pager via:

    nopager;

## Managing Users
<hr>
MySQL server is a multi-user system. If we are already in the MySQL client, and want to determine the user we are currently connected as, we can run the command: 

    SELECT current_user;
All MySQL users are defined as a combination of their name and where they are connecting from. In this case, we are the root user and we are connecting from localhost (i.e. the same machine the server is running on).

The MySQL server stores the information for users and privileges in a table called user within the mysql database.

    SELECT user, host FROM mysql.user;
This table presents us with the usernames defined in our MySQL server and what hosts they are allowed to connect from.

### Creating a User
To create a new MySQL user we use the command CREATE USER. We must then specify a new username and hostname for that user to connect from. A username & hostname combination is defined like 'username'@'hostname'. Notice the single quotes (') around the username and hostname and the @ between them. Lastly, we specify the password by adding IDENTIFIED BY 'password' afterwards. If you omit IDENTIFIED BY from the CREATE USER command, people will be able to connect as a user without specifying a password, which would be a serious security hazard.

    CREATE USER 'sally'@'192.168.77.1' IDENTIFIED BY 'passwordForSally321';

#### Host Wildcards
Sometimes we want to create a user for multiple clients in different locations. To do that we can use the wildcard % in the host specification. For example, let's say we have an office where all the computers have IP addresses that start with 192.168.77. If we wanted to quickly and easily create a user those computers could all share (called office_user) we could use 'office_user'@'192.168.77.%', thus allowing any client in the IP range of 192.168.77.1 to 192.168.77.255 to connect. We could go one step further and use 'office_user'@'%', which would allow people to connect as that user from anywhere on the internet (assuming they know the user's password).

In general though, it is a good idea to make the user specifications as restrictive as possible, in order to limit the chances of a malicious person from gaining access to our databases.

** By default, the MySQL server is configured to disallow connections coming from outside of the server itself, meaning even if a user's host is set to %, it can still only connect from localhost. **

To create a user that can connect from multiple hosts, you will need separate CREATE USER commands. For each host you wish to allow access from, create a user with the same username, but a different hostname.

In addition, you will need to grant privileges separately to each user/host combination you create.

### User Privileges
https://dev.mysql.com/doc/refman/8.0/en/privileges-provided.html#idm139711220094800

    GRANT ALL ON *.* TO 'billy'@'localhost';

The first part of the command (GRANT ALL) specifies which permissions we want to give to a user. If we need to be more fine-grained, we can list individual privileges to allow the user. A common example might be creating a read_only user in our production database server. This would be an account other developers could use to look up and analyze data, without the risk of accidentally changing anything. To grant our read_only user these privileges, we need to do:
    
    GRANT SELECT ON *.* TO 'read_only'@'localhost';

The second portion (ON *.*) is how we control what databases and tables the privileges applies to. It is in the format of database_name.table_name, where * is a wildcard for each. Our prior examples granted privileges for all databases and all tables. Instead, if wanted our user sally to only be able to SELECT, INSERT, UPDATE, and DELETE from a single table called sallys_table inside sally_db we would do:

    GRANT SELECT, INSERT, UPDATE, DELETE ON sally_db.sallys_table TO 'sally'@'localhost';

Lastly, what about the permission to grant privileges themselves? To accomplish this, we add WITH GRANT OPTION to the end of our GRANT command. 

    GRANT ALL ON *.* TO 'billy'@'localhost' WITH GRANT OPTION;

If you want to find out the current privileges to a specific user you can run the following command:

    SHOW GRANTS for 'username'@'hostname';

### Dropping a User
The process of removing a user from the system is known as "dropping" it. For example, to remove sally from our server, we would run:

    DROP USER 'sally'@'localhost';

DROP USER does not automatically close any open user sessions. Rather, in the event that a user with an open session is dropped, the statement does not take effect until that user's session is closed. Once the session is closed, the user is dropped, and that user's next attempt to log in fails. 

#### Create a new database administrator
    
    mysql> GRANT ALL ON *.* TO 'misterlewis'@'localhost' WITH GRANT OPTION;
    mysql> SHOW GRANTS FOR 'misterlewis'@'localhost' \G

The username should be the same as the username on your mac. You can run the command whoami (from your shell, not from mysql)
If you are trying to log in to MySQL as a user that has the same username as the user you are logged in to your computer as, you will not need to specify the -u option.

    mysql -p;

# Databases
<hr>
The main organization structure of MySQL is a database. One MySQL server can have many databases. In fact, our MySQL server came with three system databases already defined, one of which we have already been working with (mysql). Databases are where MySQL stores virtually all of its data (the notable exception being users & their privileges).

### Creating

    CREATE DATABASE IF NOT EXISTS database_name;

Database names should be all lower case, with underscores used to separate words in their name. Often times we will end a database name with _db.

Sometimes we may be creating a database in an automated script. In this case, if we try to create a database that already exists, MySQL will give us an error. We can avoid this problem by adding the condition IF NOT EXISTS. That way, if the database has already been created, the CREATE query will be skipped.

### Listing

    SHOW DATABASES;

### Selecting
Since virtually all MySQL information is stored within a database, it can be convenient to switch to a particular database. Doing so ensures that your subsequent queries refer (by default) to tables and other objects within that database. 

    USE database_name;

At times it may be necessary to refer to a table or object in a separate database. Or, if you have just connected to a MySQL server, you may not have any database selected. To do this, you can use the syntax:

    database_name.table_name

Notice that most of our queries refer to the mysql database (e.g. mysql.user). That is because we had not selected any database at that point.

### Show Current db

    SELECT database();
You can actually find out the query used to create a database with:

    SHOW CREATE DATABASE database_name;
The query has given us the exact SQL command necessary to recreate the database. This could be useful if we were trying to export or duplicate our database on a different server. 

### Deleting

    DROP DATABASE IF EXISTS database_name;
Trying to delete a database that does not already exist can create errors. To avoid this problem when trying to drop a database in a script we use IF EXISTS.

#### Database vs Schema
You may notice the word "schema" being used in documentation in several places. Other RDBMSs use schemas as a second level of organization within databases and strictly separate databases from each other from the user's perspective. Within MySQL, "database" and "schema" mean the same thing and can be used interchangeably.

#### Application specific databases
When you begin developing an application backed by a database, you must decide how to organize that information within your database. Most web applications can be encapsulated in a single database. Because of this, we will usually pair our application's database with a dedicated user. This user would be granted full control of just that database. We do this also as a security measure: if our application's user is somehow compromised, attackers only have access to the data for that application, not to any other database on our server.

    Note: Most other RDBMSs take this practice one step further, treating users & schemas interchangeably, or declaring that a schema is "owned" by a particular user. MySQL is unique in that it completely separates the idea of "users" from "databases / schemas"

#### Quoting Identifiers
Although great care should be used to avoid using <a href="https://dev.mysql.com/doc/mysqld-version-reference/en/keywords-8-0.html">reserved words</a> in your database names, there is actually a way around it. In SQL, you can actually use any word for a database name, even space characters, so long as we enclose the database name in back ticks (``). In practice though, do not do this. Using a reserved word as a table name is almost never worth the trouble it takes to do so; the same goes double for names with spaces in them.




