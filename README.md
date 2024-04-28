# Sistema-de-Gestion-de-la-Biblioteca-Abraham-Valdelomar-
"Proyecto de gestión de biblioteca 'Abraham Valdelomar', desarrollado por el grupo 7 del curso de estructura de datos. Sistema completo para administrar usuarios, libros, préstamos, devoluciones y visualizar historial. Implementa operaciones de búsqueda, adición, eliminación y visualización de listas."
**Descripción del Proyecto: Sistema de Gestión de la Biblioteca "Abraham Valdelomar"**
 El sistema estará compuesto por los siguientes módulos:
1. **Gestión de Usuarios:**
   - Buscar usuario: Permite buscar usuarios por diferentes criterios, como nombre, apellido o número de identificación.
   - Eliminar usuario: Permite eliminar un usuario de la base de datos.
   - Agregar usuario: Permite agregar un nuevo usuario a la biblioteca.
   - Ver lista de usuarios: Muestra la lista completa de usuarios registrados en la biblioteca.

2. **Gestión de Libros:**
   - Buscar libro: Permite buscar libros por título, autor, categoría, etc.
   - Eliminar libro: Permite eliminar un libro de la base de datos.
   - Agregar libro: Permite agregar un nuevo libro al catálogo de la biblioteca.
   - Ver lista de libros: Muestra la lista completa de libros disponibles en la biblioteca.

3. **Gestión de Préstamos:**
   - Buscar usuario: Permite buscar un usuario para realizar un préstamo.
   - Buscar libro (Ver Stock): Permite buscar un libro y verificar su disponibilidad en el stock.
   - Prestar libro: Permite realizar un préstamo, reduciendo el stock del libro y aumentando la cantidad de libros adquiridos por el usuario.
   - Ver lista de préstamos: Muestra la lista de préstamos activos en la biblioteca.

4. **Gestión de Devoluciones:**
   - Buscar usuario: Permite buscar un usuario para procesar una devolución.
   - Mostrar lista con el mismo id_Usuario: Muestra la lista de préstamos asociados a un usuario específico.
   - Reducir cantidadLibrosAdquiridos(usuario) y aumentar el stock(libro): Procesa la devolución, aumentando el stock del libro devuelto y reduciendo la cantidad de libros adquiridos por el usuario.

5. **Mostrar Historial de Operaciones:**
   - Muestra un historial completo de préstamos y devoluciones realizados en la biblioteca, permitiendo un seguimiento detallado de las operaciones realizadas.

El sistema estará diseñado para ser fácil de usar, permitiendo a los bibliotecarios gestionar eficientemente todos los aspectos relacionados con la biblioteca "Abraham Valdelomar". Además, se implementarán medidas de seguridad para garantizar la integridad y confidencialidad de los datos de los usuarios y libros.
