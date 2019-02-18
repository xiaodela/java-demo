hsqldb
#服务端启动
java -cp hsqldb-j5-2.2.4.jar org.hsqldb.Server

#客户端连接
java -cp hsqldb-j5-2.2.4.jar org.hsqldb.util.DatabaseManagerSwing -url jdbc:hsqldb:hsql://localhost/ -driver org.hsqldb.jdbcDriver