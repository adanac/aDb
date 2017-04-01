/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.15 : Database - adb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`adb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `adb`;

/*Table structure for table `sales` */

DROP TABLE IF EXISTS `sales`;

CREATE TABLE `sales` (
  `year` int(11) NOT NULL,
  `country` varchar(20) NOT NULL,
  `product` varchar(32) NOT NULL,
  `profit` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales` */

insert  into `sales`(`year`,`country`,`product`,`profit`) values (2004,'china','apple',2001),(2004,'china','banana',2002),(2004,'china','orange',2003),(2005,'china','apple',2004),(2005,'china','banana',2005),(2005,'china','orange',2005),(2005,'china','apple',2006),(2005,'china','banana',2007),(2005,'china','orange',2008),(2006,'china','apple',2010),(2006,'china','banana',2011),(2006,'china','orange',2012);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
