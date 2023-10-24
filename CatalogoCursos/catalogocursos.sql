-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 24, 2023 at 04:23 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `catalogocursos`
--

-- --------------------------------------------------------

--
-- Table structure for table `alumnos`
--

CREATE TABLE `alumnos` (
  `identificador` int(10) NOT NULL,
  `ci` varchar(10) NOT NULL,
  `nombreCompleto` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cursos`
--

CREATE TABLE `cursos` (
  `identificador` int(10) NOT NULL,
  `nombreCurso` varchar(255) NOT NULL,
  `duracion` varchar(255) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `cupoActual` int(10) NOT NULL,
  `cupoMaximo` int(10) NOT NULL,
  `requisitos` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cursos`
--

INSERT INTO `cursos` (`identificador`, `nombreCurso`, `duracion`, `estado`, `cupoActual`, `cupoMaximo`, `requisitos`, `descripcion`) VALUES
(1, 'Física General', '4 meses', 0, 0, 25, '* NO cursar más de 4 cursos\n* Tener un correo valido', 'Estudio de las leyes y principios\nque rigen el movimiento, la energía\ny la materia.'),
(2, 'Introducción a la Programación', '4 meses', 0, 0, 25, '* NO cursar más de 4 materia\n* Tener un correo valido\n* Una laptop', 'Desarrolla habilidades de pensamiento algorítmico, aprende a comunicarte con las computadoras y crea programas para resolver problemas.'),
(3, 'Sistemas de Información II', '4 meses', 0, 0, 25, '* NO cursar más de 4 materias\n* Tener un correo valido\n* Habilidades blandas', 'Toma de decisiones, automatización de procesos, mejora de la eficacia, gestion de la información y apoyo sobre los objetivos de las organizaciones.'),
(4, 'Base de Datos II', '4 meses', 0, 0, 25, '* NO cursar más de 4 cursos\n* Tener un correo valido\n* Haber cursado BD-I', 'Optimización de consultas, usando modelos relacionales, objetos-relacional u otros.'),
(5, 'Mercadotecnia', '4 meses', 0, 0, 25, '* NO cursar más de 4 cursos\n* Tener correo valido\n* Habilidades blandas', 'Conocer las necesidades de los clientes, diseñar productos y servicios atractivos y comunicar el valor a los consumidores.'),
(6, 'Circuitos Electrónicos', '4 meses', 0, 0, 25, '* NO cursar más de 4 cursos\n* Tener un correo valido\n* Habilidades blandas', 'Utilizando componentes electrónicos, aprende a diseñar y construir circuitos electrónicos para realizar funciones específicas.');

-- --------------------------------------------------------

--
-- Table structure for table `inscritos`
--

CREATE TABLE `inscritos` (
  `identificador` int(11) NOT NULL,
  `ci` varchar(10) NOT NULL,
  `nombreCurso` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`identificador`);

--
-- Indexes for table `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`identificador`);

--
-- Indexes for table `inscritos`
--
ALTER TABLE `inscritos`
  ADD PRIMARY KEY (`identificador`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `identificador` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cursos`
--
ALTER TABLE `cursos`
  MODIFY `identificador` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `inscritos`
--
ALTER TABLE `inscritos`
  MODIFY `identificador` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
