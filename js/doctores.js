function change(enfermedad, doctores,turno){
    enfermedad = document.getElementById(enfermedad);
    doctores = document.getElementById(doctores);
    doctores.value ="";
    doctores.innerHTML = "";
    
    if(enfermedad.value == "Seleccione enfermedad"){
        var optionArray = ["Seleccione doctor|Seleccione doctor" ];
    }
    else if(enfermedad.value == "Enfermedad 1"){
    var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 1|Doctor 1",
                              "Doctor 2|Doctor 2",
                              "Doctor 3|Doctor 3"];
    } else if(enfermedad.value == "Enfermedad 2"){
    var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 4|Doctor 4",
                              "Doctor 5|Doctor 5",
                              "Doctor 6|Doctor 6"
                             ];                              
    } else if(enfermedad.value == "Enfermedad 3"){
        var optionArray = ["Seleccione doctor|Seleccione doctor","Doctor 7|Doctor 7",
                                  "Doctor 8|Doctor 8",
                                  "Doctor 9|Doctor 9"
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