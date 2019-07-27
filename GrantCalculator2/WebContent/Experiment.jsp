<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Experiment</title>
</head>
<body>
<h1>These are the inputs from Appraise a Grant Page</h1>
<ul>
	<li><p>SAT: <%= request.getParameter("SAT_Score") %></p></li>
	<li><p>ACT: <%= request.getParameter("ACT_Score") %></p></li>
	<li><p>Race: <%= request.getParameter("race") %></p></li>
	<li><p>Level of Education: <%= request.getParameter("education") %></p></li>
	<li><p>Job?: <%= request.getParameter("job_status") %></p></li>
	<li><p>Annual family income: <%= request.getParameter("family_income") %></p></li>
	
	<%!
	int SAT;
	int ACT;
	int grantMoney;
	String race;
	String education;
	String job;
	double famIncome;
	%>
	<%
	grantMoney = 360;
	SAT = Integer.parseInt(request.getParameter("SAT_Score"));
	ACT = Integer.parseInt(request.getParameter("ACT_Score"));
	race = request.getParameter("race");
	education = request.getParameter("education");
	job = request.getParameter("job_status");
	famIncome = Integer.parseInt(request.getParameter("family_income"));
	//calculation based off of SAT
	if(SAT > 1500) {
        grantMoney += 5000;
    }
    else if(SAT > 1300 && SAT <= 1500) {
        grantMoney += 3000;
    }
    else if(SAT > 1000 && SAT <= 1300) {
        grantMoney += 1500;
    }
    else if (SAT >= 800 && SAT <= 1000) {
        grantMoney += 1000;
    }
    else{
        ;
    }
	
	//calculating grant through ACT
    if(ACT > 34) {
        grantMoney += 5000;
    }
    else if(ACT > 30 && ACT <= 34) {
        grantMoney += 3000;
    }
    else if(ACT > 23 && ACT <= 30) {
        grantMoney += 1500;
    }
    else if (ACT >= 1 && ACT <= 23) {
        grantMoney += 1000;
    }
    else{
        ;
    }
	
  //calculating grant through level of education
    switch(education){
    case "Associate Degree":
        grantMoney += 1500;
        break;
    case "Basic High School Diploma":
        grantMoney += 500;
        break;
    case "Honors High School Diploma":
        grantMoney += 1000;
        break;
    case "Undergraduate":
        grantMoney += 2000;
        break;
    case "Graduate":
        grantMoney += 3000;
        break;
    default:
        break;
    }
  
  //calculating grant through race
    switch(race) {
    case "White":
        grantMoney += 50;
        break;
    case "Black or African American":
        grantMoney += 300;
        break;
    case "American Indian or Alaska Native":
        grantMoney += 500;
        break;
    case "Asian":
        grantMoney += 200;
        break;
    case "Native Hawaiian or Other Pacific Islander":
        grantMoney += 400;
        break;
    default:
        break;
    }
  
  //calculating grant through job status
    if(job == "yes") {
       grantMoney += 500;
    }
    else if (job == "no") {
       grantMoney += 50;
    }
    else{
        ;
    }
  
  //calculating grant through family income
    //if(famIncome != NULL){
       if(famIncome > 200000) {
        grantMoney += 200;
        }
        else if(famIncome > 150000 && famIncome <= 200000) {
            grantMoney += 400;
        }
        else if(famIncome > 100000 && famIncome <= 150000) {
            grantMoney += 1000;
        }
        else if(famIncome > 80000 && famIncome <= 100000) {
            grantMoney += 2000;
        }
        else {
            //echo "i was here";
            grantMoney += 5000;
        }
    //}
  
  	System.out.println("your grant is: " + grantMoney);
	%>
	<p></p>
</ul>
</body>
</html>