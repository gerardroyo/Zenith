Feature: Navegación
    Para ver las paginas dentro de FRT
    Sin haber logueado
    Puedo hacer click en los links

    Background: Estoy en la web de Free Range Testers sin la sesión iniciada
        Given Navegar a www.freerangtesters.com

    Scenario Outline: Puedo acceder a las subsecciones haciendo click en la navegacion superior
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
        When Voy a Cursos usando la barra de navegacion
        And Seleccionar Introduccion al Testing y comprar

    
    Scenario: Los susarios puedes seleccionar un plan cuando estan registrados
        When El usuario selecciona Recursos y navega a Automation Sandbox
        Then El sistema puede validar las opciones del primer dropdown de la apgina Automation Sandbox