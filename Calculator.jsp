<html>

<head>
    <title>Calculator</title>
</head>

<body>
    <h2 style="text-align:center;">Basic Arithmetic Calculator</h2>
    <form method="post">
        Enter First Number: <input type="text" name="num1" required><br><br>
        Enter Second Number: <input type="text" name="num2" required><br><br>

        Select Operation:
        <select name="operation">
            <option value="add">Addition</option>
            <option value="sub">Subtraction</option>
            <option value="mul">Multiplication</option>
            <option value="div">Division</option>
        </select><br><br>
        <input type="submit" value="Calculate">
    </form>
    <%
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        if(n1 != null && n2 != null && operation != null) {
            try {
                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                double result = 0;

                if(operation.equals("add")) {
                    result = num1 + num2;
                    out.println("<h4>Addition Result: " + result + "</h4>");
                }
                else if(operation.equals("sub")) {
                    result = num1 - num2;
                    out.println("<h4>Subtraction Result: " + result + "</h4>");
                }
                else if(operation.equals("mul")) {
                    result = num1 * num2;
                    out.println("<h4>Multiplication Result: " + result + "</h4>");
                }
                else if(operation.equals("div")) {
                    if(num2 != 0) {
                        result = num1 / num2;
                        out.println("<h4>Division Result: " + result + "</h4>");
                    } else {
                        out.println("<h4>Error: Division by zero</h4>");
                    }
                }

            } catch(Exception e) {
                out.println("<h4>Invalid input!</h4>");
            }
        }
    %>
</body>

</html>