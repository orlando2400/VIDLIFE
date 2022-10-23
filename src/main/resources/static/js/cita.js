$(document).ready(function() {
  listaEspecialidad();
  listaDoctor();
  registrarCita();
  $('#citas').DataTable();
 });

async function listaEspecialidad() {
  
  const request = await fetch('api/especialidades', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const especialidades = await request.json();
  let listadoEspecialidad ='';
  for (let especialidad of especialidades) {
    let especialidadHtml = '<option value="' + especialidad.nombre + '">' + especialidad.nombre + '</option>';
    listadoEspecialidad += especialidadHtml;
  }
  document.querySelector('#optionEspecialidad').outerHTML = listadoEspecialidad;
}
async function listaDoctor() {
  
  const request = await fetch('api/doctores', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const doctores = await request.json();
  let listadoDoctores ='';
  let comboBoxEspecialidad = document.getElementById('comboBoxEspecialidad');
  let lenguaje = comboBoxEspecialidad.value;
  console.log(lenguaje);
  if(lenguaje=="Cardiología"){
  	for (let doctor of doctores) {    
	   if(doctor.especialidad[doctor] == 1){
		   let doctorHtml = '<option value="' + doctor.nombres + '">' + doctor.nombres + '</option>';
       	   listadoDoctores += doctorHtml;
	   } 
       
  }
  
  document.querySelector('#optionDoctores').outerHTML = listadoDoctores;
}
}

 async function registrarCita() {
   let datos = {};
   datos.codigo = document.getElementById('codigo').value;
   datos.apellidos= document.getElementById('apellidos').value;
   datos.especialidad = document.getElementById('especialidad').value;
   datos.doctores = document.getElementById('doctores').value;
   datos.calendario = document.getElementById('calendario').value;
   datos.turno = document.getElementById('turno').value;
   console.log(datos);
   const request = await fetch('api/registrarCita', {
     method: 'POST',
     headers: {
       'Accept': 'application/json',
       'Content-Type': 'application/json'
     },
     body: JSON.stringify(datos)
   });
   const cita = await request.json();
   alert("La cita fue reservada con éxito!");
   window.location.replace("cita.html");
 
 }
