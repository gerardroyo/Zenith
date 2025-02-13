Feature: La barra de navegacion superior me permite navegar a todas las subsecciones
    Para ver las paginas dentro de FRT
    Sin haber logueado
    Puedo hacer click en los links

    Scenario Outline: Puedo acceder a las subsecciones haciendo click en la navegacion superior
        Given Navegar a www.freerangtesters.com
        When Voy a <secciones> usando la barra de navegacion
        Examples:
            | secciones |
            | Cursos    |
            | Recursos  |
            | Blog      |
            | Mentorías |
            | Udemy     |
            | Academia  |

    Scenario: Los cursos se muestran de la forma correcta a los potenciales clientes
        Given Navegar a www.freerangtesters.com
        When Voy a Cursos usando la barra de navegacion
        And Seleccionar Introduccion al Testing y comprar

    @Planes
    Scenario: Los susarios puedes seleccionar un plan cuando estan registrados
        Given Navegar a www.freerangtesters.com
        When El usuario selecciona Recursos y navega a Automation Sandbox
        Then Puedo validar las opciones del primer dropdown de la apgina Automation Sandbox