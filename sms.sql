-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 02, 2015 at 07:22 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
`id` int(11) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `first_name`, `last_name`, `email`, `phone`) VALUES
(1, 'Aslii', 'Bikin', 'asfsaf@gmail.com', '23423242343254'),
(3, 'Hamal', 'KC', 'hamalKC@gmail.com', '1234553242'),
(4, 'Ganesh', 'Maharjan', 'ganeshmahargan@live.com', '235435'),
(5, 'Ram', 'Maharjan', 'ram.maharjan@yahoo.com', '345345'),
(6, 'Hari', 'Malla', 'hari@hotmail.com', '235445'),
(7, 'Rimal', 'Rai', 'rimal.rai@hotmail.com', '25435'),
(8, 'Ritesh', 'Aryal', 'ritesh.aryal@yahoo.com', '252345'),
(9, 'Anij', 'Dhakal', 'ajij.dhikal@hotmail.com', '235435'),
(10, 'Alin', 'Shrestha', 'alin.shrestha@gmail.com', '9876543'),
(11, 'Abin', 'Pradhan', 'abinpradhan@hotmail.com', '1247453'),
(12, 'Raja', 'Acharaya', 'raja.acharaya@gmail.com', '9813029187234214'),
(15, 'Abhishak', 'Sharma', 'abhishak.sharma@gmail.com', '12345676543'),
(16, 'Jane', 'doe', 'fdsjlk@gmail.com', '765432');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
