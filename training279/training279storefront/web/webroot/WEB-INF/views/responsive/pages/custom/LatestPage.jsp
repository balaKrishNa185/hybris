<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">

    <cms:pageSlot position="LatestProductsSlotName" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
        <cms:component component="${feature}" />
    </cms:pageSlot>

</template:page>
