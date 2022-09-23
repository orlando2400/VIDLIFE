function change(enfermedad, doctores){
    enfermedad = document.getElementById(enfermedad);
    doctores = document.getElementById(doctores);
    doctores.value ="";
    doctores.innerHTML = "";
    
    if(enfermedad.value == "Seleccione especialidad"){
        var optionArray = ["Seleccione doctor|Seleccione doctor" ];
    }
    else if(enfermedad.value == "Cardiología"){
    var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 1|Doctor 1",
                              "Doctor 2|Doctor 2",
                              "Doctor 3|Doctor 3"];
    } else if(enfermedad.value == "Medicina general"){
    var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 4|Doctor 4",
                              "Doctor 5|Doctor 5",
                              "Doctor 6|Doctor 6"
                             ];                              
    } else if(enfermedad.value == "Radiología"){
        var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 7|Doctor 7",
                                  "Doctor 8|Doctor 8",
                                  "Doctor 9|Doctor 9"
                                 ];                                               
     
    } else if(enfermedad.value == "Traumatología"){
      var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 10|Doctor 10",
                                "Doctor 11|Doctor 11",
                                "Doctor 12|Doctor 12"
                               ];                                               
   
    } else if(enfermedad.value == "Dermatología"){
      var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 13|Doctor 13",
                                "Doctor 14|Doctor 14",
                                "Doctor 15|Doctor 15"
                               ];                                               
   
    };

  for(option = 0;option < optionArray.length; option++){
    var pair = optionArray[option].split("|");
    var newOption = document.createElement("option");
    newOption.value = pair[0];
    newOption.innerHTML = pair[1];
    doctores.options.add(newOption);
  };    
   
}

