<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Grant Calculator: Apply Now</title>
      
   <style>
      body{
      background-color: ghostwhite;
      }
       
       #NavBar{
        list-style-type: none;
        margin: 0;
        padding: 0;
        background-color: lightgray;
        overflow: hidden;
       }
       
       .nav{
           float: left;
       }
       
       .nav a {
        display: block;
        color: #000;
        padding: 8px 16px;
        text-decoration: none;
        }
       
       /* Change the link color on hover */
       li a:hover {
        background-color: dimgrey;
        color: white;
       }
   </style>
      
  </head>
  <body>
    <div style="background-color: dimgrey; text-align: center; padding: 10px">
        <h1 style="color: whitesmoke; border-style: solid"><b>Grant Calculator</b> </h1>
        <h6 style="color: whitesmoke"><i>Powered by the Federal Government</i> </h6>
    </div>
      
    <ul id="NavBar">
        <li class="nav"><a href="Home.jsp">Home</a></li>
        <li class="nav"><a href="ApplyNow1.jsp">Apply Now</a></li>
        <li class="nav"><a href="AppraiseAGrant.jsp">Appraise a Grant</a></li>
        <li class="nav"><a href="AboutUS.jsp">About Us</a></li>
    </ul>
      
     <div>
    
        <img src="./Images/Left_Image.png" style="width: 211px; height: 700px" align="left">
        <img src="./Images/Right_Image.png" style="width: 211px; height: 700px" align="right">
        <h2 align="center"><b> Apply Now for the Sweet Fruits of the Future </b></h2>
         
        <div style="padding-left: 240px">
        <form style="padding: 10px" action="Apply Now 2.php" method="post">
            <fieldset>
            <legend>Personal Information:</legend>
                First Name:<br>
                <input type="text" name="firstname"><br>
                Last Name:<br>
                <input type="text" name="lastname"><br>
                Gender:<br>
                <input type="radio" name="Gender" value="Male"> Male <br>
                <input type="radio" name="Gender" value="Female"> Female <br>
                <input type="radio" name="Gender" value="Not Disclosed"> Prefer not to disclose <br>
                Date of Birth:<br>
                <input type="date" name="bdaytime"><br>
                Address:<br>
                <input type="text" name="address1" value="Line 1"><br><br>
                <input type="text" name="address2" value="Line 2"><br><br>
                <input type="text" name="address3" value="City"> <input type="text" name="address4" value="State"> <input type="text" name="address5" value="Zip Code"><br>
                Race:<br>
                <input type="radio" name="race" value="White">White<br>
                <input type="radio" name="race" value="Black or African American">Black or African American<br>
                <input type="radio" name="race" value="American Indian or Alaska Native">American Indian or Alaska Native<br>
                <input type="radio" name="race" value="Asian">Asian<br>
                <input type="radio" name="race" value="Native Hawaiian or Other Pacific Islander">Native Hawaiian or Other Pacific Islander<br>
                Do you have a job?:<br>
                <input type="radio" name="job_status" value="yes">Yes<br>
                <input type="radio" name="job_status" value="no">No<br><br>
                
                <input type="submit" value="Continue">
            </fieldset>
            
            </form>
            
        </div>
        
    </div>
    
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>
