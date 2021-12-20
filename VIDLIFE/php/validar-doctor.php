<?php
$codigo = $_POST['codigo'];
$contra = $_POST['contra'];
//ConexionBD
$conexion = mysqli_connect("localhost","root","","vidlife");
$consulta = "SELECT*FROM doctores where Cod_doc= '$codigo' and Contra_doc = '$contra'";
$resultado = mysqli_query($conexion,$consulta);

$filas=mysqli_num_rows($resultado);

if($filas>0){
    header("location:../html/citas-medico.html");
}else{
    echo "Error de conexion";
}
mysqli_free_result($resultado);
mysqli_close($conexion);