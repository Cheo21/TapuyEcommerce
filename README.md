# TapuyEcommerce
Ecommerce Tapuy - Java Project



# Casos de Uso para la Aplicación de Ecommerce de Tote Bags y futuros productos

## 1. Registro de Usuario
- **Actor:** Usuario
- **Descripción:** Permitir a los nuevos usuarios crear una cuenta en la aplicación.
- **Flujo:**
    1. El usuario accede a la página de registro.
    2. Completa el formulario con su información personal.
    3. Envía el formulario.
    4. La aplicación verifica los datos y crea una cuenta.
    5. El usuario recibe un correo de confirmación.

## 2. Inicio de Sesión
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios registrados acceder a su cuenta.
- **Flujo:**
    1. El usuario accede a la página de inicio de sesión.
    2. Introduce su correo electrónico y contraseña.
    3. Envía el formulario.
    4. La aplicación verifica las credenciales.
    5. El usuario es redirigido a su panel de control.

## 3. Navegación por Productos
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios explorar las productos disponibles.
- **Flujo:**
    1. El usuario accede a la página principal de productos.
    2. Se muestran las productos disponibles con sus imágenes, precios y descripciones.
    3. El usuario puede aplicar filtros y ordenar los productos.

## 4. Ver Detalles del Producto
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios ver más detalles sobre un producto específica.
- **Flujo:**
    1. El usuario selecciona un producto de la lista de productos.
    2. Se muestra la página de detalles del producto.
    3. El usuario puede elegir la cantidad y agregar el producto al carrito.

## 5. Agregar al Carrito de Compras
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios agregar productos al carrito de compras.
- **Flujo:**
    1. El usuario selecciona la cantidad de productos que desea.
    2. Hace clic en "Agregar al carrito".
    3. La aplicación actualiza el carrito y muestra un mensaje de confirmación.

## 6. Ver Carrito de Compras
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios revisar los productos que han agregado al carrito.
- **Flujo:**
    1. El usuario accede a su carrito de compras.
    2. Se muestra una lista de productos en el carrito.
    3. El usuario puede modificar la cantidad o eliminar productos.

## 7. Proceso de Pago
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios realizar el pago de sus productos.
- **Flujo:**
    1. El usuario accede al carrito de compras y hace clic en "Pagar".
    2. La aplicación solicita la información de envío y pago.
    3. El usuario completa la información y envía el pedido.
    4. La aplicación procesa el pago y confirma la compra.

## 8. Gestión de Pedidos
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios ver el estado de sus pedidos.
- **Flujo:**
    1. El usuario accede a su cuenta.
    2. Navega a la sección de pedidos.
    3. Se muestran los pedidos realizados con su estado.

## 9. Gestión de Opiniones y Reseñas
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios dejar opiniones y reseñas sobre los productos.
- **Flujo:**
    1. El usuario accede a la página de detalles del producto.
    2. Deja una reseña y calificación.
    3. La aplicación guarda la reseña y la muestra en la página del producto.

## 10. Recuperación de Contraseña
- **Actor:** Usuario
- **Descripción:** Permitir a los usuarios recuperar su contraseña en caso de olvido.
- **Flujo:**
    1. El usuario accede a la página de inicio de sesión y selecciona "Olvidé mi contraseña".
    2. Introduce su correo electrónico.
    3. La aplicación envía un enlace para restablecer la contraseña.
    4. El usuario sigue el enlace y establece una nueva contraseña.

---

## Casos de Uso de Administración

## 11. Agregar Producto
- **Actor:** Administrador
- **Descripción:** Permitir al administrador agregar nuevas productos a la tienda.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Selecciona la opción "Agregar Producto".
    3. Completa el formulario con la información del producto.
    4. Envía el formulario.
    5. La aplicación guarda el producto y muestra un mensaje de confirmación.

## 12. Editar Producto
- **Actor:** Administrador
- **Descripción:** Permitir al administrador modificar la información de un producto existente.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Navega a la lista de productos.
    3. Selecciona un producto para editar.
    4. Modifica la información necesaria.
    5. Envía el formulario.
    6. La aplicación actualiza el producto y muestra un mensaje de confirmación.

## 13. Eliminar Producto
- **Actor:** Administrador
- **Descripción:** Permitir al administrador eliminar productos de la tienda.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Navega a la lista de productos.
    3. Selecciona un producto para eliminar.
    4. Confirma la eliminación.
    5. La aplicación elimina el producto y muestra un mensaje de confirmación.

## 14. Ver Lista de Productos
- **Actor:** Administrador
- **Descripción:** Permitir al administrador ver todos los productos disponibles en la tienda.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Navega a la sección "Productos".
    3. Se muestra una lista de todos los productos con información básica.
    4. El administrador puede seleccionar productos para editarlos o eliminarlos.

## 15. Agregar Usuario
- **Actor:** Administrador
- **Descripción:** Permitir al administrador crear nuevas cuentas de usuario.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Selecciona la opción "Agregar Usuario".
    3. Completa el formulario con la información del nuevo usuario.
    4. Envía el formulario.
    5. La aplicación crea el nuevo usuario y muestra un mensaje de confirmación.

## 16. Editar Usuario
- **Actor:** Administrador
- **Descripción:** Permitir al administrador modificar la información de un usuario existente.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Navega a la lista de usuarios.
    3. Selecciona un usuario para editar.
    4. Modifica la información necesaria.
    5. Envía el formulario.
    6. La aplicación actualiza la información del usuario y muestra un mensaje de confirmación.

## 17. Eliminar Usuario
- **Actor:** Administrador
- **Descripción:** Permitir al administrador eliminar cuentas de usuario.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Navega a la lista de usuarios.
    3. Selecciona un usuario para eliminar.
    4. Confirma la eliminación.
    5. La aplicación elimina la cuenta del usuario y muestra un mensaje de confirmación.

## 18. Ver Lista de Usuarios
- **Actor:** Administrador
- **Descripción:** Permitir al administrador ver todos los usuarios registrados en la aplicación.
- **Flujo:**
    1. El administrador accede al panel de administración.
    2. Navega a la sección "Usuarios".
    3. Se muestra una lista de todos los usuarios con información básica.
    4. El administrador puede seleccionar usuarios para editarlos o eliminarlos.
