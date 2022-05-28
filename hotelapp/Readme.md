Contratulations on your Eclipselink application.  The Application connects to Oracle Database using the Oracle JDBC driver. The directory structure for this is shown here.

```
project
└───Readme.md
└───pom.xml    
└───src
     |
     └───java
           └───...
                └───App.java
                model
                  └───Emp.java
                  └───Dept.java
     └───resources
           └───META-INF
                 └─── persistence.xml
```

* `resources/META-INF/persistence.xml` contains a persistence unit called `OracleATPD` that is configured with `dbuser`, `dbpasswd` and `dburl` that you can provide while creating the project or you can edit persistent.xml and update these to point to 
your Oracle Database. 
* Sample model files (`Emp.java` & `Dept.java`) are placed under model directory. 
* Make sure to use the schema (JDBCSampleData.sql) at https://tinyurl.com/y2a7x65z
to create the tables "emp" and "dept" required for this sample. 
* If your schema does not have `EMP` and `DEPT` tables, delete the source files `Emp.java` and `Dept.java`. After deleting the files delete the entry for those from `resources/META-INF/persistence.xml`
* To generate models in Eclipse click on `New` &#x2192; `JPA Entity` and if you are already connected to your database, you can create entity directly based on your database entities.
* The build file `pom/xml` has maven co-ordinates for Oracle JDBC driver and also for eclipselink. If you want to know more about the Oracle JDBC driver and other additional libraries, you can refer to [link](http://www.oracle.com/jdbc)
* Run `App.java` to connect to the Oracle database and perform some database operations   
