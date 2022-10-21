$(document).ready(function() {
    // on ready
 });
 
 async function traerCombobox() {
  
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

}
 
 async function registrarCita() {
   let datos = {};
   datos.codigo = document.getElementById('codigo').value;
   datos.apellidos= document.getElementById('apellidos').value;
   datos.enfermedad = document.getElementById('enfermedad').value;
   datos.doctores = document.getElementById('doctores').value;
   datos.calendario = document.getElementById('calendario').value;
   datos.turno = document.getElementById('turno').value;
 
   const request = await fetch('api/cita', {
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
 