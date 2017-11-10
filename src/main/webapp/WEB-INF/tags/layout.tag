<%@tag description="Simple Wrapper Tag" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pl">
    <head>
        <meta charset="utf-8">
        <title>Budżet domowy</title>
        <meta name="description" content="Budżet domowy">
        <meta name="author" content="Łukasz Baryczka">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    </head>
    <body>
        <header>
            <jsp:include page="/WEB-INF/jsp/menu.jsp" />
        </header>

        <div>
          <section>
            <jsp:doBody/>
          </section>
        </div>

        <footer>
            <jsp:include page="/WEB-INF/jsp/footer.jsp" />
        </footer>
    </body>
</html>