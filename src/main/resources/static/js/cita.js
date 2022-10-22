$(document).ready(function() {
  listaEspecialidad();
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
    let especialidadHtml = '<option value="' + especialidad.id + '">' + especialidad.nombre + '</option>';
    listadoEspecialidad += especialidadHtml;
  }
  document.querySelector('#comboboxEspecialidad').outerHTML = listadoEspecialidad;
  //$('#comboboxEspecialidad').append(s);
}
 
 /*async function listaDoctor() {
  
  const request = await fetch('api/cita', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  alert("La cita fue reservada con éxito!");
  window.location.href = 'cita.html'

}*/

 async function registrarCita() {
   let datos = {};
   datos.codigo = document.getElementById('codigo').value;
   datos.apellidos= document.getElementById('apellidos').value;
   datos.enfermedad = document.getElementById('enfermedad').value;
   datos.doctores = document.getElementById('doctores').value;
   datos.calendario = document.getElementById('calendario').value;
   datos.turno = document.getElementById('turno').value;
 
   const request = await fetch('api/cita/registrar', {
     method: 'POST',
     headers: {
       'Accept': 'application/json',
       'Content-Type': 'application/json'
     },
     body: JSON.stringify(datos)
   });
   alert("La cita fue reservada con éxito!");
   window.location.href = 'cita.html'
 
 }
 