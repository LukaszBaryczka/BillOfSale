<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div>
    <form name="newBillForm" action="/newBill" method="post">
        <label for="date">Data</label>
        <input type="time" id="date" name="date"/>

        <label for="product">Produkt</label>
        <input type="text" id="product" name="product"/>
        <label for="category">Kategoria</label>
        <select name="category">
          <option value="volvo">Volvo</option>
          <option value="saab">Saab</option>
          <option value="fiat">Fiat</option>
          <option value="audi">Audi</option>
        </select>

        <label for="productList">Produkt</label>
        <select name="productList">
          <option value="volvo">Volvo</option>
          <option value="saab">Saab</option>
          <option value="fiat">Fiat</option>
          <option value="audi">Audi</option>
        </select>

        <label for="amount">Ilość</label>
        <input type="number" id="amount" name="amount"/>

        <label for="price">Cena za sztukę</label>
        <input type="number" id="price" name="price"/>

        <div>
            <button type="submit">Dodaj produkt</button>
        </div>
    </form>
</div>