海报

# 项目介绍

本系统是一个在线的音乐管理和播放系统，仿网易云网页端。分为管理员端 和用户前台端。

管理员：可以上传音乐，建立歌，专辑等。也可进行用户管理
用户前台：可以查看所有的音乐，歌单，专辑。也可进行播放，收藏，评论等。

本系统功能完整，代码结构良好，非常具有学习参考意义。对于编程初学者来说是个很好的二次开发项目。当然也可以直接拿来用，部署到自己服务器，当做一个个人的音乐播放站点。


**关键词**： 在线音乐系统；音乐播放;  Spring Boot 框架；Java；MySQL数据库;  VUE;  前后端分离，毕业设计

**技术栈:**

* 后端:  SpringBoot +Mybatis+Redis
* 数据库 : MySQL 8
* 前端:  VUE + ElementUI

**开发环境依赖：**
* MySQL 8 数据库
* JDK 15+
* Maven 3
* IDEA
* Node 16
* Redis

## 一 系统介绍

### 管理后台
![Clip_2024-10-26_11-48-39.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261149598.png)

* 登录成功首页
  ![管理后台首页.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261201432.png)


#### 用户管理：可以查看，修改，删除网站的所有用户
![用户管理.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261202070.png)

#### 歌手管理： 可以录入歌手信息，添加歌曲
![歌手管理.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261202049.png)

- 新增修改歌手
  ![添加歌手.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261203161.png)

- 歌手歌曲管理
  ![歌曲管理.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261205458.png)

![添加歌曲.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261205539.png)

#### 歌单管理：可以创建歌单，选择歌曲放进歌单里面
![歌单管理.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261206704.png)
![歌单评论.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261206241.png)
- 给歌单添加歌曲
  ![歌单添加歌曲.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261206830.png)

![歌单添加歌曲2.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261206409.png)

**后台添加好歌单单曲后，就可以从用户前台进入听歌啦**

### 用户前台
- 登录注册
  ![注册登录.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261428300.png)


#### 首页
![首页全部.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261428151.png)

#### 歌单
![歌单.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261428296.png)

- 歌单详情
  ![歌单详情.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261433916.png)


#### 歌手
![歌手.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261429611.png)

- 歌手详情
  ![歌手-详情.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261433972.png)


#### 排行榜
![排行榜.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261429959.png)

#### 播放页面
![听歌.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261430666.png)


- 我的
  ![我的.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261429666.png)
  ![我的收藏歌单.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261429574.png)


## 二 技术介绍
### 1.技术栈

* 后端:  SpringBoot + Mybatis+Redis
* 数据库 : MySQL 8
* 前端:  VUE + ElementUI

**开发环境依赖：**
* MySQL 8 数据库
* JDK 18+
* Maven 3
* IDEA
* Node 16
* Redis

### 2.代码介绍
> ![code.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261434141.png)



### 三 Quick Start

### 1. 环境准备
* MYSQL 8
* JDK 18+
* Maven 3
* IDEA
* Node 16 （如果不需要对配置后台二次开发,不需要安装)

> 以上环境需要准备好, 在自己的本地搭建好,方可进行下面步骤
### 2. 下载源码

---
**文章末尾获取下载方式。**
---


### 3. 后端部署

> 注意需要先本地安装 Redis ，端口 6379，不需要密码

- Step1: 下载源码
- Step2: IDEA 打开项目
- Step3: 安装 Maven 依赖
- Step4: 配置检查
> 数据库配置: 找到配置文件 `src/main/resources/application.yml` 修改为你本地的数据库配置。如
```yml
spring.datasource.url=jdbc:mysql://localhost:3306/itsource34??useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=true  
spring.datasource.username=root  
spring.datasource.password=root
```

注意：**不需要手动创建数据库和初始化表结构，直接运行项目，会自动创建数据库，初始化SQL语句**
- Step4: 启动后端项目
  【截图】运行按钮
> Idea 运行后端项目,看到以下信息,表示运行成功
> ![success.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261434231.png)


### 4. 前端部署

#### 管理员端
打开终端, 执行下面命令,运行前端项目:
- Step1: 安装npm依赖
>  npm install --registry=http://registry.npmmirror.com
- Step2: 启动前端项目
> npm run serve
> 看到如下信息表示部署成功,浏览器点击任何一个即可打开
> ![Clip_2024-10-26_11-47-44.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261147236.png)


**管理员账号登录： 账号：itsource  密码：itsource**
#### 用户端
打开终端, 执行下面命令,运行前端项目:
- Step1: 安装npm依赖
>  npm install --registry=http://registry.npmmirror.com
- Step2: 启动前端项目
> npm run serve
> 看到如下信息表示部署成功,浏览器点击任何一个即可打开
![Clip_2024-10-26_11-46-55.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410261147196.png)


### 注意事项

如果部署失败请参考项目说明环境，版本是否一致。


## 下载源码

---
---

关注微信公众号: **ITSource 每日分享**,回复 `0034` 获取源码

> 可付费二次开发,  定制, 一对一讲解, 有意可微信联系:  **itguangit**

---
---

**关注微信公众号 【ITSource每日分享】,免费获取一万个IT资源：项目源码，软件工具，面试面经，学习视频 应有尽有！！！!**

![关注 微信公众号 ! 获取更多学习资源呀](https://itguang.oss-cn-beijing.aliyuncs.com/订阅号.jpeg)

**更多资源推荐:**
- [ITSource 分享 第1期【问卷调查系统】springboot+vue](https://mp.weixin.qq.com/s/KE7jOCpvbLVddVnu81fg9A)
- [ITSource 分享 第2期【在线考试系统】springboot+vue](https://mp.weixin.qq.com/s/So2Nb20hotB3S0aQtqf1mQ)
- [ITSource 分享 第4期【简洁的问卷调查系统】springboot+vue](https://mp.weixin.qq.com/s/HeSGWxxU-bGoeONjyR6qsw)
- [ITSource 分享 第5期【校园信息墙系统】springboot+vue](https://mp.weixin.qq.com/s/oA0Mbz3c4q1ziQbHvr72dg)
- [ITSource 分享 第6期【网址云收藏系统】】](https://mp.weixin.qq.com/s/NddwJn9h2f5n6dY-spCFhQ)
- [ITSource 分享 第7期【小程序记账软件系统】springboot+小程序](https://mp.weixin.qq.com/s/kRigevtP_EjpOS_Bw2UdZQ)
- [ITSource 分享 第8期【班级学生管理系统】](https://mp.weixin.qq.com/s/oJ-PEahVwQkwRwE8sINyZg)
- [ITSource 分享 第9期【学知识在线考试系统】springboot+vue](https://mp.weixin.qq.com/s/euvjxBX3bVG71IF8yV_zJQ)
- [ITSource 分享 第10期【个人博客系统】](https://mp.weixin.qq.com/s/j5O3oi0Yc28v8ROomyR9_g)
- [ITSource 分享 第11期【简单的教务管理系统】](https://mp.weixin.qq.com/s/5AEgWPW1v0Y5Z77LGoMm1Q)
- [ITSource分享第12期【驾校理论课考试系统】springboot+vue](https://mp.weixin.qq.com/s/YpJXaGC5338ydeLCMBiLtg)
- [ITSource分享第13期【班级信息管理系统】](https://mp.weixin.qq.com/s/7FYxlXoKrb5r-nckcPlAWw)
- [ITSource分享第14期【电影院售票管理系统】springboot+vue](https://mp.weixin.qq.com/s/oRU1VtvB68Z1qJbuGIGrGw)
- [ITSource分享第15期【图书管理系统】](https://mp.weixin.qq.com/s/rgixOXuJyJyZlL8Ny0AE8A)
- [ITSource分享第16期【连锁门店管理系统】springboot+vue](https://mp.weixin.qq.com/s/5aOJ9EHIqcVqtYWdKn3ONw)
- [ITSource分享第17期【宠物管理系统(带论文)springboot+vue】](https://mp.weixin.qq.com/s/S_mDclr4BKOzGZHG6etnoA)
- [ITSource分享第18期【二手交易(电商,商城)系统(带论文和PPT)springboot+vue】](https://mp.weixin.qq.com/s/_LlrbVBq_6nhGp3BY7F38A)
- [ITSource分享第19期【学生选课管理系统springboot+vue】](https://mp.weixin.qq.com/s/b8qTt-XT9SZNzQTKOJQqSw)
- [ITSource分享第20期-Java SpringBoot 微信点餐系统视频](https://mp.weixin.qq.com/s/xqmR6R96yFSZeQOmkCQcmQ)
- [ITSource分享第21期【房屋租赁管理系统】springboot+vue](https://mp.weixin.qq.com/s/7F7EhKv_CG81LEDS1XEJHw)
- [# ITSource分享第22期【景区旅游管理系统】springboot](https://mp.weixin.qq.com/s/ygvHpQeg_frDWD2f1F-R_A)
- [ ITSource分享第23期【图书管理系统】springboot+layui前后端分离](https://mp.weixin.qq.com/s/b1-prJSZdQcEBy0M6JOnDg)
- [第24期【在线拍卖系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/VGKHG_ZPER3VA5rTdbXFiQ)
- [第25期【汽车票网上预定系统】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/CB6xxXJkvK1GAhAVFUgHZw)
- [# 第26期【在线旅游购买网站系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/BfUtXw77GQzXgPQfGyubmg)
- [# 第27期【校园网上租赁交易系统设计与实现】springboot+vue前后端分离+论文+部署文档](https://mp.weixin.qq.com/s/FvWVPlmOkuULLQ9seQHcpQ)
- [# ITSource分享第28期【网上宠物用品交易系统设计与实现】springboot+vue前后端分离+论文+部署文档](https://mp.weixin.qq.com/s/dMLwreWgZFsY56VrQv_dzw)
- [# ITSource分享第29期【在线文档管理系统的设计与实现】springboot+vue前后端分离+论文+PPT+部署文档](https://mp.weixin.qq.com/s/K1ON3lHfR_1K3iKgC2yhMw)
- [# ITSource分享第30期【在线考试管理系统的设计与实现】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/s3rYbnRFRgcGYkFzWVlJyw)
- [# ITSource分享第31期【在线视频网站系统的设计与实现】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/AdpMAAPM5PGz3scaYh9Hsg)
- [ITSource分享第32期【在线问卷调查网站系统的设计与实现】springboot+vue前后端分离](https://mp.weixin.qq.com/s/SXKUMVhMsKqKbeso2yWKdg)
- [ITSource分享第33期【在线小说阅读系统】](https://mp.weixin.qq.com/s/NAjSRu-dX9hJ4uftcOsvHA)

---


---

## 完整数据库文件请至 微信公众号下载