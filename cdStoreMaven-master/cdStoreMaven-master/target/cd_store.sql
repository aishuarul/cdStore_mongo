-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.20 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for cd_store
DROP DATABASE IF EXISTS `cd_store`;
CREATE DATABASE IF NOT EXISTS `cd_store` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cd_store`;


-- Dumping structure for table cd_store.address
DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
  `address_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `street` varchar(100) NOT NULL,
  `province` varchar(20) NOT NULL,
  `country` varchar(20) NOT NULL,
  `zip` varchar(20) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table cd_store.address: ~2 rows (approximately)
DELETE FROM `address`;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`address_id`, `street`, `province`, `country`, `zip`, `phone`) VALUES
	(1, '123 King adward', 'ON', 'Canada', 'K1E 6T5', '613-123-4567'),
	(2, '34 Rue St-Dominiqu', 'QC', 'Canada', 'K2E 6K5', '514-123-8569'),
	(3, '99 Main ave.', 'ON', 'Canada', 'K6E 9T5', '613-123-9568');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


-- Dumping structure for table cd_store.cd
DROP TABLE IF EXISTS `cd`;
CREATE TABLE IF NOT EXISTS `cd` (
  `cd_id` varchar(20) NOT NULL,
  `title` varchar(60) NOT NULL,
  `price` int(10) unsigned NOT NULL,
  `category` enum('COUNTRY','POP','ROCK') NOT NULL,
  PRIMARY KEY (`cd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table cd_store.cd: ~9 rows (approximately)
DELETE FROM `cd`;
/*!40000 ALTER TABLE `cd` DISABLE KEYS */;
INSERT INTO `cd` (`cd_id`, `title`, `price`, `category`) VALUES
	('cd001', 'Johnny Cash Greatest Hits', 1599, 'COUNTRY'),
	('cd002', 'Willy Nelson Greatest', 1599, 'COUNTRY'),
	('cd003', 'Patsy Cline Im So Lonely', 1599, 'COUNTRY'),
	('cd004', 'Tragically Hip Fully Completely', 2000, 'ROCK'),
	('cd005', 'Beatles White Album', 2000, 'ROCK'),
	('cd006', 'Rolling Stones Forty Licks', 2000, 'ROCK'),
	('cd007', 'Madonna Greatest Hits', 1799, 'POP'),
	('cd008', 'Alannis Morissette Jagged Little Pill', 1799, 'POP'),
	('cd009', 'Video Killed the Radio Star', 1799, 'POP'),
	('cd010', 'It is the time to disco', 23, 'ROCK');
/*!40000 ALTER TABLE `cd` ENABLE KEYS */;


-- Dumping structure for table cd_store.purchase_order
DROP TABLE IF EXISTS `purchase_order`;
CREATE TABLE IF NOT EXISTS `purchase_order` (
  `purchase_order_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `last_name` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `status` enum('ORDERED','PROCESSED','DENIED') NOT NULL,
  `address` int(10) unsigned NOT NULL,
  PRIMARY KEY (`purchase_order_id`),
  KEY `address` (`address`),
  CONSTRAINT `purchase_order_ibfk_1` FOREIGN KEY (`address`) REFERENCES `address` (`address_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

-- Dumping data for table cd_store.purchase_order: ~51 rows (approximately)
DELETE FROM `purchase_order`;
/*!40000 ALTER TABLE `purchase_order` DISABLE KEYS */;
INSERT INTO `purchase_order` (`purchase_order_id`, `last_name`, `first_name`, `status`, `address`) VALUES
	(1, 'Liam', 'Peyton', 'PROCESSED', 1),
	(2, 'Peter', 'White', 'DENIED', 2),
	(3, 'Andy', 'ADLER', 'ORDERED', 3),
	(4, 'Andy', 'Alder', 'ORDERED', 2),
	(5, 'Rest Service', 'Alder', 'ORDERED', 2),
	(6, 'Simple Test', 'Alder', 'ORDERED', 2),
	(7, 'Simple Test', 'Alder', 'ORDERED', 2),
	(8, 'Simple Test', 'Alder', 'ORDERED', 2),
	(9, 'Simple Test', 'Alder', 'ORDERED', 2),
	(10, '', 'Alder', 'ORDERED', 2),
	(11, '', 'Alder', 'ORDERED', 2),
	(12, '', 'Alder', 'ORDERED', 2),
	(13, '', 'Alder', 'ORDERED', 2),
	(14, '', 'Alder', 'ORDERED', 2),
	(15, '', 'Alder', 'ORDERED', 2),
	(16, '', 'Alder', 'ORDERED', 2),
	(17, '', 'Alder', 'ORDERED', 2),
	(18, '', 'Alder', 'ORDERED', 2),
	(19, 'arul', 'Alder', 'ORDERED', 2),
	(20, '', 'Alder', 'ORDERED', 2),
	(21, '', 'Alder', 'ORDERED', 2),
	(22, 'Test From Front End', 'Alder', 'ORDERED', 2),
	(23, 'Test From Front End', 'Alder', 'ORDERED', 2),
	(24, 'aishrest', 'Alder', 'ORDERED', 2),
	(25, 'aishrest', 'Alder', 'ORDERED', 2),
	(26, 'aishrest', 'Alder', 'ORDERED', 2),
	(27, 'Test with Jason', 'Alder', 'ORDERED', 2),
	(28, 'Test with Jason', 'Alder', 'ORDERED', 2),
	(29, 'Test with Jason', 'Alder', 'ORDERED', 2),
	(30, 'browser', 'Alder', 'ORDERED', 2),
	(31, 'browser2', 'Alder', 'ORDERED', 2),
	(32, 'browser3', 'Alder', 'ORDERED', 2),
	(33, 'browser3', 'Alder', 'ORDERED', 2),
	(34, 'arulfrombrowser', 'Alder', 'ORDERED', 1),
	(35, 'arulfrombrowser2', 'Alder', 'ORDERED', 1),
	(36, 'arulfrombrowser2', 'Alder', 'ORDERED', 1),
	(37, 'arulfrombrowser2', 'Alder', 'ORDERED', 1),
	(38, 'front', 'Alder', 'ORDERED', 2),
	(39, 'front', 'Alder', 'ORDERED', 2),
	(40, 'front', 'Alder', 'ORDERED', 2),
	(41, 'frontpost', 'Alder', 'ORDERED', 2),
	(42, 'frontpost', 'Alder', 'ORDERED', 2),
	(43, 'frontpost', 'Alder', 'ORDERED', 2),
	(44, 'frontpost2', 'Alder', 'ORDERED', 2),
	(45, 'frontpost2', 'Alder', 'ORDERED', 2),
	(46, 'frontpost2', 'Alder', 'ORDERED', 2),
	(47, 'frontpost3', 'Alder', 'ORDERED', 2),
	(48, 'frontpost21', 'Alder', 'ORDERED', 2),
	(49, 'frontpost21', 'Alder', 'ORDERED', 2),
	(50, 'arulfrombrowser3', 'Alder', 'ORDERED', 1),
	(51, 'Test with Jason2', 'Alder', 'ORDERED', 2);
/*!40000 ALTER TABLE `purchase_order` ENABLE KEYS */;


-- Dumping structure for table cd_store.purchase_order_item
DROP TABLE IF EXISTS `purchase_order_item`;
CREATE TABLE IF NOT EXISTS `purchase_order_item` (
  `purchase_order_id` int(10) unsigned NOT NULL,
  `cd_id` varchar(20) NOT NULL,
  `price` int(10) unsigned NOT NULL,
  PRIMARY KEY (`purchase_order_id`,`cd_id`),
  KEY `cd_id` (`cd_id`),
  CONSTRAINT `purchase_order_item_ibfk_1` FOREIGN KEY (`purchase_order_id`) REFERENCES `purchase_order` (`purchase_order_id`) ON DELETE CASCADE,
  CONSTRAINT `purchase_order_item_ibfk_2` FOREIGN KEY (`cd_id`) REFERENCES `cd` (`cd_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table cd_store.purchase_order_item: ~2 rows (approximately)
DELETE FROM `purchase_order_item`;
/*!40000 ALTER TABLE `purchase_order_item` DISABLE KEYS */;
INSERT INTO `purchase_order_item` (`purchase_order_id`, `cd_id`, `price`) VALUES
	(1, 'cd001', 1599),
	(2, 'cd002', 2000),
	(3, 'cd003', 1799);
/*!40000 ALTER TABLE `purchase_order_item` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
