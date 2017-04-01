当配置完 generatorConfig.xml 后(只需要改个表名)，只需要打开控制台，执行脚本：
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite  即可。
这样在生成之后，就可以在src目录下找到相应的文件夹，每个表格都会对应三个文件（实体类、接口、配置文件）。

运行generate.bat即可。
generatorConfig_all.xml：此版本增加了实体实现了Serializable接口并增加了toString()方法。
但是没有生成数据字段对应的注释。
