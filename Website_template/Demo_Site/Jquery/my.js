
$(document).ready(function(){

     $("#contact_link").click(function() {
        $('html, body').animate({
            scrollTop: $("#footer").offset().top
        }, 2000);
      });


      $("#product_link").click(function() {
        $('html, body').animate({
            scrollTop: $("#product").offset().top
        }, 2000);
      });

      $("#about_link").click(function() {
        $('html, body').animate({
            scrollTop: $("#About").offset().top
        }, 2000);
      });

      $("#Join_us").click(function() {
       $('html, body').animate({
           scrollTop: $("#join").offset().top
        }, 2000);
      });

      $("#publisher").click(function(){
        $("#advertiser_form").hide();
        $("#publisher_form").toggle();
      });

    $("#advertiser").click(function(){
        $("#publisher_form").hide();
        $("#advertiser_form").toggle();
    });


  });


var re = /\S+@\S+\.\S+/;
var alphaExp = /^[a-zA-Z]+$/;
var numericExpression = /^[0-9]+$/;


function validate_form(){
var name = document.forms["enquiry_form"]["name"].value;
var email = document.forms["enquiry_form"]["email"].value;
var country = document.forms["enquiry_form"]["country"].value;
var company = document.forms["enquiry_form"]["company"].value;
var skype = document.forms["enquiry_form"]["skype"].value;

 if (name == "" || email == "" || country == "" || company == "" || skype == "")
  {
    $(".msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Fill All The Fields</div>");
    return false;
  }
  else if (!re.test(email))
  {
    $(".msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Email-Id</div>");
    return false;
  }
  else if (name.match(numericExpression))
  {
    $(".msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Name</div>");
    return false;
  }
  else if (county.match(numericExpression))
   {
     $(".msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Country</div>");
     return false;
   }
   else if (company.match(numericExpression))
   {
     $(".msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Company Name</div>");
     return false;
   }
   else
   {
    $(".msg").html("<div class='alert alert-success'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a> <strong>Success!</strong>Your Application Is Excepted.</div>");
    return true;
   }

}


function validate_publisher(){
var name = document.forms["pub_form"]["P_name"].value;
var email = document.forms["pub_form"]["P_email"].value;
var country = document.forms["pub_form"]["P_country"].value;
var company = document.forms["pub_form"]["P_company"].value;
var skype = document.forms["pub_form"]["P_skype"].value;

 if (name == "" || email == "" || country == "" || company == "" || skype == "")
  {
    $(".p_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Fill All The Fields</div>");
    return false;
  }
  else if (!re.test(email))
  {
    $(".p_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Email-Id</div>");
    return false;
  }
  else if (name.match(numericExpression))
  {
    $(".p_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Name</div>");
    return false;
  }
  else if (county.match(numericExpression))
   {
     $(".p_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Country</div>");
     return false;
   }
   else if (company.match(numericExpression))
   {
     $(".p_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Company Name</div>");
     return false;
   }
   else
   {
    $(".p_msg").html("<div class='alert alert-success'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a> <strong>Success!</strong>Your Application Is Excepted.</div>");
    return true;
   }

}


function validate_advertiser(){
var name = document.forms["adv_form"]["A_name"].value;
var email = document.forms["adv_form"]["A_email"].value;
var country = document.forms["adv_form"]["A_country"].value;
var company = document.forms["adv_form"]["A_company"].value;
var skype = document.forms["adv_form"]["A_skype"].value;

 if (name == "" || email == "" || country == "" || company == "" || skype == "")
  {
    $(".a_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Fill All The Fields</div>");
    return false;
  }
  else if (!re.test(email))
  {
    $(".a_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Email-Id</div>");
    return false;
  }
  else if (name.match(numericExpression))
  {
    $(".a_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Name</div>");
    return false;
  }
  else if (county.match(numericExpression))
   {
     $(".a_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Country</div>");
     return false;
   }
   else if (company.match(numericExpression))
   {
     $(".a_msg").html("<div class='alert alert-danger'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a>Please Provide Correct Company Name</div>");
     return false;
   }
   else
   {
    $(".a_msg").html("<div class='alert alert-success'> <a class='close' data-dismiss='alert' aria-label='close'>&times;</a> <strong>Success!</strong>Your Application Is Excepted.</div>");
    return true;
   }

}


