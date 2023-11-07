<?php
// Conexión a la base de datos
$servername = "localhost";
$username = "root";
$password = "";
$database = "login";

// Creación de la conexión
$conn = mysqli_connect($servername, $username, $password, $database);

// Comprobación de la conexión
if (!$conn) {
    die("Conexión fallida: " . mysqli_connect_error());
}

// Consulta a la base de datos
$usuario = $_POST['usuario'];
$contrasena = $_POST['contrasena'];

$sql = "SELECT * FROM usuarios WHERE usuario = '$usuario' AND contrasena = '$contrasena'";
$result = mysqli_query($conn, $sql);

// Comprobación del resultado
if (mysqli_num_rows($result) > 0) {
  // Usuario y contraseña correctos
  $row = mysqli_fetch_assoc($result);
  session_start();
  $_SESSION['usuario'] = $row['nombre'];
  echo "1"; // Sesión iniciada correctamente
} else {
  // Usuario y contraseña incorrectos
  echo "0"; // Usuario o contraseña incorrectos
}

// Cierre de la conexión
mysqli_close($conn);
?>
