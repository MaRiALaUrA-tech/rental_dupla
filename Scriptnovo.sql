create database rental_db;



SELECT version();



create table categoria(

categoria_id serial primary key,

nome varchar (50) not null,

descricao text

);



create table equipamento(

equipamento_id serial primary key,

categoria_id int,

nome_equipamento varchar (100) not null,

marca varchar (100) not null,

modelo varchar (100) not null,

potencia varchar (30) not null,

material varchar (100) not null,

peso numeric not null,

dimensoes varchar (100) not null,

cor varchar (50) not null,

qtd_total int not null,

qtd_disponivel int not null,

qtd_minima int not null,

status_equipamento boolean not null

);



create table usuario(

usuario_id serial primary key,

locacao_id int,

nome_completo varchar (300) not null,

cpf varchar (14) not null unique,

email varchar (100) not null unique,

senha varchar (50) not null,

tipo_usuario varchar (20) not null check (tipo_usuario in ('funcionario', 'cliente')),

codigo_verif_func int not null



);



create table locacao(

locacao_id serial primary key,

equipamento_id int,

qtd_locacao int,

data_locacao timestamp not null,

data_devolucao_prevista timestamp not null,

data_devolucao timestamp not null,

status_locacao boolean not null,

obs_locacao text

);







create table movimentacao(

movimentacao_id serial primary key,

usuario_id int,

tipo_movimentacao varchar (100) not null check (tipo_movimentacao in ('entrada', 'saida')),

qtd_movimentacao int,

data_movimentacao timestamp not null,

obs_movimentacao text

);

alter table movimentacao add column equipamento_id int;



alter table equipamento add constraint fk_categoria foreign key (categoria_id) references categoria (categoria_id);

alter table locacao add constraint fk_equipamento foreign key (equipamento_id) references equipamento (equipamento_id);

alter table usuario add constraint fk_locacao foreign key (locacao_id) references locacao (locacao_id);

alter table movimentacao add constraint fk_usuario foreign key (usuario_id) references usuario (usuario_id);

alter table movimentacao add constraint fk_equipamento foreign key (equipamento_id) references equipamento (equipamento_id);




insert into categoria (nome, descricao) values 
('Ferramentas Elétricas', 'Equipamentos elétricos portáteis para corte, perfuração e desbaste.'),
('Maquinário Pesado', 'Compactadores, betoneiras e máquinas de grande porte para obras.'),
('Equipamentos de Segurança', 'Itens de proteção individual e coletiva para ambiente de trabalho.');



insert into equipamento (categoria_id, nome_equipamento, marca, modelo, potencia, material, peso, dimensoes, cor, qtd_total, qtd_disponivel, qtd_minima, status_equipamento ) values 
(1, 'Martelete Perfurador', 'Bosch', 'GBH 2-24 D', '820W', 'Aço e Polímero', 2.80, '367x210mm', 'Azul', 10, 8, 2, true),
(2, 'Betoneira 400 Litros', 'Menegotti', 'Prime 400L', '2.0 CV', 'Aço Carbono', 155.00, '1000x1400x1500mm', 'Amarelo', 4, 3, 1, true),
(1, 'Esmerilhadeira Angular', 'Makita', 'GA4530', '720W', 'Alumínio e Polímero', 1.80, '266x128x103mm', 'Verde', 15, 12, 3, true);



insert into locacao (equipamento_id, qtd_locacao, data_locacao, data_devolucao_prevista, data_devolucao, status_locacao, obs_locacao) values 
(1, 1, '2026-08-10 08:00:00', '2026-08-17 17:00:00', '2026-08-17 16:30:00', true, 'Equipamento devolvido limpo e sem avarias.'),
(2, 1,'2026-08-15 09:00:00', '2026-08-22 18:00:00', '2026-08-21 10:00:00', true, 'Devolução antecipada pelo cliente.'),
(3, 2, '2026-08-18 07:30:00', '2026-08-25 17:00:00', '2026-08-25 17:00:00', false, 'Em andamento na obra do centro.');


insert into usuario (locacao_id, nome_completo, cpf, email, senha, tipo_usuario, codigo_verif_func) values 
(1, 'Carlos Eduardo Silva', '123.456.789-01', 'carlos.silva@email.com', 'senha123', 'cliente', 0),
(NULL, 'Ana Paula Souza', '987.654.321-02', 'ana.souza@locadora.com', 'admin456', 'funcionario', 1052),
(2, 'Marcos Oliveira', '456.789.123-03', 'marcos.obra@email.com', 'obra2026', 'cliente', 0);


insert into movimentacao (usuario_id, tipo_movimentacao, qtd_movimentacao, data_movimentacao, obs_movimentacao) values 
(2, 'entrada', 5, '2026-08-01 10:00:00', 'Aquisição de novas unidades de Martelete Perfurador.'),
(1, 'saida', 1, '2026-08-10 08:15:00', 'Retirada de equipamento para locação #1.'),
(2, 'entrada', 1, '2026-08-17 16:35:00', 'Retorno de locação #1 para o estoque.');