INSERT INTO `dogadjaji` (`id_dog`, `tim1`, `tim2`, `mesec`, `dan`, `sat`, `status`, `kreator`) VALUES
(3, 'Zvezda', 'Partizan', 'Mart', 6, '14:00', 0, 'daki123'),
(4, 'FK nebitni', 'Partizan', 'April', 15, '17:00', 0, 'daki123'),
(5, 'Partizan', '', 'Oktobar', 15, '19:00', 0, 'saki123'),
(6, 'FK Jabuka', '', 'Avgust', 16, '21:00', 0, 'saki123'),
(7, 'FK Jabuka', '', 'Jul', 15, '19:00', 0, 'saki123');
 

INSERT INTO `igraci` (`igrac`, `status`, `nazivtima`, `id`) VALUES
('saki123', 1, 'Partizan', 17),
('saki123', 1, 'FK Jabuka', 18),
('daki123', 1, 'Zvezda', 19),
('daki123', 1, 'FK nebitni', 20),
('suki123', 0, 'Partizan', 21),
('siri123', 0, 'Partizan', 22),
('selja123', 0, 'Partizan', 23),
('seki123', 1, 'Partizan', 24),
('sejo123', 0, 'Partizan', 25),
('sara123', 0, 'Partizan', 26),
('caki123', 0, 'FK Jabuka', 27),
('demi123', 0, 'FK Jabuka', 28),
('deki123', 0, 'FK Jabuka', 29),
('dumi123', 0, 'FK Jabuka', 30),
('sejo123', 0, 'FK Jabuka', 31),
('siri123', 0, 'FK Jabuka', 32),
('miki123', 0, 'FK Jabuka', 33),
('deki123', 0, 'Zvezda', 34),
('demi123', 0, 'Zvezda', 35),
('diki123', 0, 'Zvezda', 36),
('dipsi123', 0, 'Zvezda', 37),
('duki123', 0, 'Zvezda', 38),
('dumi123', 0, 'Zvezda', 39),
('deki123', 0, 'FK nebitni', 40),
('dipsi123', 0, 'FK nebitni', 41),
('caki123', 0, 'FK nebitni', 42),
('duki123', 0, 'FK nebitni', 43),
('seki123', 0, 'FK nebitni', 44),
('sejo123', 0, 'FK nebitni', 45),
('sara123', 0, 'FK nebitni', 46),
('dumi123', 0, 'FK nebitni', 47),
('caki123', 0, 'Zvezda', 48);


INSERT INTO `timovi` (`nazivtima`, `kreator`, `id_tima`) VALUES
('Partizan', 'saki123', 13),
('FK Jabuka', 'saki123', 14),
('Zvezda', 'daki123', 15),
('FK nebitni', 'daki123', 16);

INSERT INTO `zabranjenitermini` (`zabr_id`, `sport`, `mesec`, `dan`, `sat`) VALUES
(8, 'Odbojka', 'Mart', 1, '12:00'),
(10, 'Odbojka', 'Januar', 1, '11:00'),
(11, 'Fudbal', 'Mart', 1, '10:00'),
(12, 'Fudbal', 'Januar', 1, '10:00'),
(13, 'Fudbal', 'Avgust', 11, '16:00'),
(14, 'Tenis', 'Januar', 7, '15:00'),
(16, 'Fudbal', 'Januar', 7, '13:00'),
(17, 'Fudbal', 'Januar', 7, '20:00');

insert into role (role)
VALUES ('ADMIN');
insert into role (role)
VALUES ('NORMAL');

insert into korisnici (email, ime, korisnickoime, password, prezime) values ('test@test.rs','Marko','miki123','$2a$10$amlU1nGSyxYIjk6zQw/IIu5mlxMD7lGSyJrVPb0Wt2chR34ejiDCa','Markovic');
insert into user_role (user_id, role_id) values (1, 1);
