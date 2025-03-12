-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.41 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.10.0.7000
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Copiando dados para a tabela farmaciagasa0.clientes: ~11 rows (aproximadamente)
DELETE FROM `clientes`;
INSERT INTO `clientes` (`IDCliente`, `Nome`, `Cupom`, `qtdprodutos_comprados`) VALUES
	(1111, 'Felipe', '10%  de desconto', 16),
	(1112, 'Márcia', NULL, 6),
	(1113, 'Lívia', NULL, 3),
	(1114, 'Maria', '10% de desconto', 23),
	(1115, 'Luciana', '10% de desconto', 18),
	(1116, 'Marcos', NULL, 12),
	(1117, 'Lucas', NULL, 9),
	(1118, 'Ana', NULL, 7),
	(1119, 'José', '10% de desconto', 21),
	(1120, 'Luana', '10% de desconto', 19),
	(1121, 'Felipa', '10%  de desconto', 25);

-- Copiando dados para a tabela farmaciagasa0.cosmeticos: ~16 rows (aproximadamente)
DELETE FROM `cosmeticos`;
INSERT INTO `cosmeticos` (`CodCosmetico`, `nome`, `preco`, `quantidade`) VALUES
	(1, ' Nivea Soft', 23.69, 37),
	(2, 'Nivea Q10', 32.45, 25),
	(3, 'Neotrogena Hydro Boost Water Gel Lotion', 69.90, 55),
	(4, 'Nivea Sun Protect & Hydrate', 45.90, 20),
	(5, ' L´Oreal Paris Elseve Óleo Extraordinário', 39.49, 60),
	(6, 'L´Oreal Paris Elvive Total Repair 5', 47.00, 39),
	(7, 'Pampers Premium Care', 67.99, 120),
	(8, 'Pampers Confort', 55.99, 90),
	(9, 'Huggies Turma da Mônica', 45.99, 85),
	(10, 'Huggies Supreme Care', 47.99, 89),
	(11, 'Esmalte Risqué', 5.99, 230),
	(12, 'Esmalte Impala', 3.99, 150),
	(13, 'Acetona Ideal', 7.30, 90),
	(14, 'Kit Siàge Eudora Acelera Crescimento', 293.90, 86),
	(15, 'Combo Completo Siàge Reconstrói Fios', 290.87, 76),
	(16, 'Nivea Lip Care Hidratante Labial Melancia', 15.30, 57);

-- Copiando dados para a tabela farmaciagasa0.farmacialogin: ~1 rows (aproximadamente)
DELETE FROM `farmacialogin`;
INSERT INTO `farmacialogin` (`IDUsuario`, `Usuario`, `Senha`) VALUES
	(1000, 'GASA', 'GASA123');

-- Copiando dados para a tabela farmaciagasa0.funcionarios: ~5 rows (aproximadamente)
DELETE FROM `funcionarios`;
INSERT INTO `funcionarios` (`IDFuncionario`, `Nome`, `Idade`, `Salario`, `Setor`) VALUES
	(1, 'Ires', 25, 5430.00, 'Gerência'),
	(2, 'Estenio', 27, 2300.00, 'Vendas'),
	(3, 'João', 25, 2300.00, 'Vendas'),
	(4, 'Thalita', 26, 3500.00, 'Marketing'),
	(5, 'Junio', 20, 1500.00, 'Reposição');

-- Copiando dados para a tabela farmaciagasa0.medicamentos: ~13 rows (aproximadamente)
DELETE FROM `medicamentos`;
INSERT INTO `medicamentos` (`CodMedicamento`, `nome`, `preco`, `quantidade`) VALUES
	(1, 'Buscofem', 20.00, 78),
	(2, 'Esparadrapo Cremer (grande branco)', 21.90, 56),
	(3, 'Paracetamol', 9.90, 103),
	(4, 'Dipirona', 9.90, 120),
	(5, 'Ibuprofeno', 12.60, 87),
	(6, 'Amoxicilina', 23.90, 93),
	(7, 'Azitromicina', 9.90, 103),
	(8, 'Loratadina', 21.20, 93),
	(9, 'Diclofenaco', 25.99, 59),
	(10, 'Losartana', 31.90, 63),
	(11, 'Metformina', 49.90, 49),
	(12, 'Nimesulida', 11.90, 73),
	(13, 'Atenolol', 59.90, 77);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
