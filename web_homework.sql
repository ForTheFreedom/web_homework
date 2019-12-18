-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: shoppings
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `goods`
--

DROP TABLE IF EXISTS `goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `goods` (
  `goodsId` int(11) NOT NULL,
  `goodsName` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `goodsIntro` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `goodsPrice` float NOT NULL,
  `goodsNum` int(11) NOT NULL,
  `publisher` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `photo` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`goodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goods`
--

LOCK TABLES `goods` WRITE;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` VALUES (1,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(2,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(3,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(4,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(5,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影'),(6,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(7,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(8,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(9,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(10,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影'),(11,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(12,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(13,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(14,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(15,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影'),(16,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(17,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(18,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(19,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(20,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影'),(26,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(27,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(28,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(29,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(30,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影'),(31,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(32,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(33,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(34,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(35,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影'),(36,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(37,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(38,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(39,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(40,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影'),(41,'蜘蛛侠之英雄远征','好莱坞大片，漫威科幻世界电影',59,1,'漫威出品','01.jpg','好莱坞电影'),(42,'奇异博士','好莱坞大片，漫威科幻世界电影',45,1,'漫威出品','02.jpg','好莱坞电影'),(43,'雷神','好莱坞大片，漫威科幻世界电影',99,1,'漫威出品','03.jpg','好莱坞电影'),(44,'复仇者联盟','好莱坞大片，漫威科幻世界电影',33,1,'漫威出品','04.jpg','好莱坞电影'),(45,'钢铁侠','好莱坞大片，漫威科幻世界电影',55,1,'漫威出品','05.jpg','好莱坞电影');
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orderdetail` (
  `orderId` int(11) NOT NULL,
  `goodsId` int(11) NOT NULL,
  `nums` int(11) NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `ordersId` (`orderId`),
  KEY `goodsId` (`goodsId`),
  CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`goodsId`) REFERENCES `goods` (`goodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
INSERT INTO `orderdetail` VALUES (3,1,1),(4,4,1),(5,4,1),(6,1,1);
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orders` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `orderDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `payMode` enum('cash','zhifubao') CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT 'cash',
  `isPayed` enum('0','1') CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `totalPrice` float DEFAULT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `userId` (`userId`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'2019-12-16 19:01:01','cash','0',33,1),(2,'2019-12-17 14:11:34','cash','0',33,3),(6,'2019-12-17 17:12:50','cash','0',59,1);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `realname` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `passwd` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `postcode` char(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `grade` int(11) DEFAULT '5',
  PRIMARY KEY (`userid`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','黄志轩','admin','admin@tt.com','131501288888','广东省广州市广州大学城华南理工校区','123456',1),(2,'\'hzx\'','黄志轩','\'hzxhzx\'','\'hzx@qq.com\'','\'1568956245\'','广东省广州市广州大学城华南理工校区','\'6565\'',2),(3,'hzx','黄志轩','hzxhzx','2658@qq.com','1568456952','广东省广州市广州大学城华南理工校区','331405',2),(4,'hzxhzx','é»å¿è½©','hzxhzx','5645@qq.com','1545645152','cdcjsklv','123568',2);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-18 15:31:40
