<h2>Crie uma aplicação para controlar a agenda de um médico do NAMI. Este médico trabalha todos os
dias de 8 as 12 hs e de 13 as 19 hs. Suas consultas possuem a duração de 1 h. </h2>
<hr>

<p>0) Se a aplicação for desenvolvida na forma gráfica utilizando a biblioteca javax.swing</p>
<p>1) Crie a classe Paciente, com seu construtor, getters e setters </p>
![image](https://user-images.githubusercontent.com/88636711/206925324-b0d26ac5-a2f8-4ba6-9bc1-6451349169ac.png)
<p>2) Crie a Classe Consulta, com seu construtor, getters e setters. Note que o construtor deve iniciar o
atributo Status com o valor 0 (zero) que indica que a consulta esta marcada.</p>
Consulta
![image](https://user-images.githubusercontent.com/88636711/206925309-59633655-89f4-464d-a37d-f295276b1f5c.png)

<p>3) Crie a classe Agenda que </p>
<p>a) Possua um atributo ArrayList<Consulta> lista; </p>
<p>b) Implemente o método adicionar que deverá receber como parâmetro uma consulta. Para inserir a
consulta na lista, o método deve verificar se o dia, mês, ano e hora da consulta estão livres, caso
positivo o método adiciona a consulta a lista, caso o horário naquele dia esteja ocupado, o método
devera gerar uma exceção “Horário Ocupado” </p>
<p>c) Implemente o método confirmar que deverá receber como parâmetro uma consulta. Para confirmar
a consulta, o método deve encontrar a consulta através do dia, mês, ano e hora da consulta e verificar
se o status da consulta é 0 (marcada), caso positivo o método altera o status para 1 (Confirmada),
caso contrário, o método devera gerar uma exceção “Status Inválido”. Se não encontrar a consulta, a
exceção “Consulta não encontrada” deve ser gerada. </p>
<p>d) Implemente o método realizar que deverá receber como parâmetro uma consulta. Para realizar a
consulta, o método deve encontrar a consulta através do dia, mês, ano e hora da consulta e verificar
se o status da consulta é 1 (confirmada), caso positivo o método altera o status para 2 (Realizada),
caso contrário, o método devera gerar uma exceção “Status Inválido”. Se não encontrar a consulta, a
exceção “Consulta não encontrada” deve ser gerada. </p>
<p>e) Implemente o método cancelar que deverá receber como parâmetro uma consulta. Para cancelar a
consulta, o método deve encontrar a consulta através do dia, mês, ano e hora da consulta e verificar
se o status da consulta é 0 ou 1 (marcada ou confirmada), caso positivo o método altera o status para
3 (cancelada), caso contrário, o método devera gerar uma exceção “Status Inválido”. Se não
encontrar a consulta, a exceção “Consulta não encontrada” deve ser gerada. (1,0 pontos)</p>
<p>f) o método listar deverá receber como parâmetro um dia, mês e ano e apresentar todas as consultas
que pertencem aquele dia, mês e ano </p>
<p>g) o método pesquisar deverá receber como parâmetro um cpf e apresentar todas as consultas que
pertencem aquele cpf, caso não existam consultas deverá apresentar a mensagem de consulta não
encontrada para cpf informado </p>
