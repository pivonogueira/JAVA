alter table paciente add column ativo tinyint;
update paciente set ativo = 1;
alter table paciente modify ativo tinyint not null;