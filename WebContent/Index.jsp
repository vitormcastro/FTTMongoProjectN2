<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Busca Noticia</title>
</head>
<body>
<form method="get" action="news/lista">
Categoria
<select name="category">
	<option value="">Todos</option>
	<option value="general">Geral</option>
    <option value="business">Negocio</option>
    <option value="entertainment">Entreterimento</option>   
    <option value="health">Saude</option>
    <option value="science">Ciência</option>
    <option value="sports">Esporte</option>
    <option value="technology">Tecnologia</option>
</select>
<br>
Cidade
<select name="country">
	<option value="">Todos</option>
	<option value="ae">Emirados Árabes Unidos</option>
    <option value="ar">Argentina</option>
    <option value="at">Ilhas Ashmore e Cartier</option>   
    <option value="au">Áustria</option>
    <option value="be">Belgica</option>
    <option value="bg">Bangladesh</option>
    <option value="br">Brasil</option>
    <option value="ca">Canada</option>
    <option value="ch">China</option>
    <option value="cn">Comores</option>
    <option value="co">Colômbia</option>
    <option value="cu">Cuba</option>
    <option value="cz">República Tcheca</option>
    <option value="de">Alemanha</option>
    <option value="eg">Egito</option>   
    <option value="fr">França</option>
    <option value="gb">Gabão</option>
    <option value="gr">Grecia</option>
    <option value="hk">Hong Kong</option>
    <option value="hu">Hungria</option>
    <option value="id">Indonésia</option>
    <option value="ie">Irlanda</option>
    <option value="il">Israel</option>
    <option value="in">India</option>
    <option value="it">Italia</option>
    <option value="jp">Japão</option>
    <option value="kr">Kiribati</option>   
    <option value="lt">Lesoto</option>
    <option value="lv">Letônia</option>
    <option value="ma">Marrocos</option>
    <option value="mx">Mexico</option>
    <option value="my">Malásia</option>
    <option value="ng">Niger</option>
    <option value="nl">Países Baixos</option>
    <option value="no">Noruega</option>
    <option value="nz">Nova Zelândia</option>
    <option value="ph">Filipinas</option>
    <option value="pl">Polonia</option>
    <option value="pt">Portugal</option>   
    <option value="ro">Romencia</option>
    <option value="rs">Sérvia</option>
    <option value="gr">Russia</option>
    <option value="sa">Arábia Saudita</option>
    <option value="se">Seicheles</option>
    <option value="sg">Senegal</option>
    <option value="si">Eslovénia</option>
    <option value="sk">Eslováquia</option>
    <option value="th">Tailândia</option>
    <option value="tr">Turquia</option>
    <option value="tw">Taiwan</option>
    <option value="ua">Ucrânia</option>
    <option value="us">Estados Unidos</option>
    <option value="ve">Venezuela</option>
    <option value="za">Zâmbia</option>
</select>
<br>
Idioma
<select name="language">
	<option value="">Todos</option>
	<option value="ar">Arabe</option>
    <option value="de">Alemão</option>
    <option value="en">Ingles</option>   
    <option value="es">Espanhol</option>
    <option value="fr">Francês</option>
    <option value="he">Hebraico</option>
    <option value="it">Italiano</option>
    <option value="nl">Holandes</option>
	<option value="no">Norueguês</option>
    <option value="pt">Português</option>
    <option value="ru">Russo</option>   
    <option value="se">Crioulo de Seychelles</option>
    <option value="ud">Urdu</option>
    <option value="zh">Chinês</option>
</select>
<br>
<input type="submit" value="Buscar"/>
</form>
</body>
</html>