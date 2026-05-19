# genetic_algorithms-


# ¿Cómo funciona el programa?

El programa simula un algoritmo genético utilizando varios agentes que intentan llegar a una meta 🎯. Cada agente posee un “ADN” compuesto por una serie de movimientos almacenados en un arreglo de genes. Estos movimientos determinan hacia dónde se moverá el agente durante toda su vida.

🧬 Al inicio, todos los agentes generan sus movimientos de forma aleatoria, por lo que la mayoría se mueve sin dirección o termina lejos de la meta. Sin embargo, después de cierto tiempo (300 frames), el programa evalúa qué agente logró acercarse más al objetivo.

🏆 El agente con el mejor rendimiento obtiene el mejor fitness, lo que significa que fue el más eficiente acercándose a la meta. Sus genes son utilizados para crear una nueva generación de agentes.

🔄 La nueva generación hereda los movimientos del mejor agente, pero con pequeñas mutaciones aleatorias. Estas mutaciones permiten que algunos agentes prueben nuevos caminos y comportamientos, haciendo posible que cada generación mejore más que la anterior.

📈 Conforme pasan las generaciones, los agentes comienzan a encontrar rutas más eficientes hacia la meta, simulando un proceso de evolución y selección natural.

🎯 Cuando un agente logra llegar a la meta, el programa muestra un mensaje en pantalla indicando el éxito del agente durante unos segundos.

💡 Este proyecto demuestra conceptos importantes de algoritmos genéticos como:

Selección natural
Fitness
Mutación
Herencia genética
Evolución por generaciones

🖥️ Todo el proyecto fue desarrollado en Java utilizando Greenfoot y Programación Orientada a Objetos (POO).
