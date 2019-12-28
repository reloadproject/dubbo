# dubbo
dubbo简单搭建

Dubbo+zookeeper 最简单的分布式搭建
https://blog.csdn.net/hua1586981/article/details/79195111

Dubbo控制台

Build Status codecov license

English version.

Demo地址

http://47.91.207.147/#/service
该地址是develop分支的最新版本，在从源码构建之前，可以先尝试demo
页面截图

index

服务治理

服务治理的部分，按照Dubbo 2.7的格式进行配置，同时兼容Dubbo 2.6，详见这里

前端部分

使用Vue.js作为javascript框架，Vuetify作为UI框架
dubbo-admin-ui/README.md中有更详细的介绍
设置 npm 代理镜像 : 可以设置npm代理镜像来加速npm install的过程：在~/.npmrc中增加 registry =https://registry.npm.taobao.org
后端部分

标准spring boot工程
application.properties配置说明
生产环境配置

下载代码: git clone https://github.com/apache/dubbo-admin.git

在 dubbo-admin-server/src/main/resources/application.properties中指定注册中心地址

构建

mvn clean package
启动

mvn --projects dubbo-admin-server spring-boot:run
或者
cd dubbo-admin-distribution/target; java -jar dubbo-admin-0.1.jar
访问 http://localhost:8080

开发环境配置

运行dubbo admin server dubbo admin server是一个标准的spring boot项目, 可以在任何java IDE中运行它
运行dubbo admin ui dubbo admin ui由npm管理和构建，在开发环境中，可以单独运行: npm run dev
页面访问 访问 http://localhost:8081, 由于前后端分开部署，前端支持热加载，任何页面的修改都可以实时反馈，不需要重启应用。
跨域问题 为了方便开发，我们提供了这种前后端分离的部署模式，主要的好处是支持前端热部署，在这种模式下，前端会通过8080端口访问后端的restful api接口，获取数据, 这将导致跨域访问的问题。因此我们在dubbo-admin-ui/config/index.js添加了支持跨域访问的配置,当前端通过npm run dev单独启动时，这些配置将被激活，允许跨域访问
Swagger 支持

部署完成后，可以访问 http://localhost:8080/swagger-ui.html 来查看所有的restful api
