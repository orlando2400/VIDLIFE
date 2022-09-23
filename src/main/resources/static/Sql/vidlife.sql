-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-12-2021 a las 23:57:54
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vidlife`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asegurados`
--

CREATE TABLE `asegurados` (
  `codig_aseg` int(9) NOT NULL,
  `nombres_aseg` varchar(50) NOT NULL,
  `apellidos_aseg` varchar(50) NOT NULL,
  `correo_aseg` varchar(50) NOT NULL,
  `telef_aseg` int(10) NOT NULL,
  `dni_aseg` int(10) NOT NULL,
  `direc_aseg` varchar(80) NOT NULL,
  `contra_aseg` varchar(30) NOT NULL,
  `contraconf_aseg` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asegurados`
--

INSERT INTO `asegurados` (`codig_aseg`, `nombres_aseg`, `apellidos_aseg`, `correo_aseg`, `telef_aseg`, `dni_aseg`, `direc_aseg`, `contra_aseg`, `contraconf_aseg`) VALUES
(10000, 'pepe', 'jajaja', 'pipipi@mail.com', 5456123, 4568792, 'mz.kfasmkfsmak', '123', '123'),
(10001, 'gaa', 'ga ga', 'gaga@mail.com', 6511235, 555555, 'mz.pipipi', '123', '123'),
(10002, 'pepe', 'jkongdnjgfd', 'gaga@mail.com', 45615516, 546786, '1adsadsfffas', '123', '123'),
(10004, 'pepe', 'don pepe', 'gaga@mail.com', 982093308, 6084245, '5', '645', '564'),
(10005, 'pepe', 'don pepe', 'gaga@mail.com', 982093308, 456, '456', 'contra', 'cointra'),
(10006, 'pepe', 'don pepe', 'gaga@mail.com', 982093308, 13212323, '145454656', '132', '123'),
(10007, 'pepe', 'don pepe', 'gaga@mail.com', 982093308, 5641213, 'adssda', 'ads', 'asd'),
(10008, 'dsa', 'das', 'ga2@gmail.com', 982093308, 24325757, '5', '55', '55');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

CREATE TABLE `doctores` (
  `Id_doc` int(6) NOT NULL,
  `Nombres_doc` varchar(50) NOT NULL,
  `Apellidos_doc` varchar(50) NOT NULL,
  `Cod_doc` int(20) NOT NULL,
  `Contra_doc` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `doctores`
--

INSERT INTO `doctores` (`Id_doc`, `Nombres_doc`, `Apellidos_doc`, `Cod_doc`, `Contra_doc`) VALUES
(1, 'Jorge Anibal', 'Rodriguez Sotomayor', 156982, 'upt657'),
(2, 'Pedro Rodrigo', 'Torres Lopez', 178243, 'pryk64'),
(3, 'Rafael Sergio', 'Ramirez Vilchez', 162273, 'qweo18');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asegurados`
--
ALTER TABLE `asegurados`
  ADD PRIMARY KEY (`codig_aseg`);

--
-- Indices de la tabla `doctores`
--
ALTER TABLE `doctores`
  ADD PRIMARY KEY (`Id_doc`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asegurados`
--
ALTER TABLE `asegurados`
  MODIFY `codig_aseg` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10009;

--
-- AUTO_INCREMENT de la tabla `doctores`
--
ALTER TABLE `doctores`
  MODIFY `Id_doc` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
