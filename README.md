<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>:Informe de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>
<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5"ÁRBOL B</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>06</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>07-Agosto-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">23:55</td>
</tr>
<tr><td colspan="4">Integrantes:
        <ul>
            <li><h5>Escobar Atamari, Diego Gabriel</h5></li>
            <li><h5>Flores Sucupaca, Ervin Eleazar </h5></li>
            <li><h5>Machicao Quispe, Gabriel Steven</h5></li>
            <li><h5>Moroccoire Pacompia Anthony Marcos</h5></li>
            <li><h5>Quispe Bejar, Garlet Analy</h5></li>
        </ul>
    </td>
    <td colspan="2">Nota:</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

<table>
    <theader>
        <tr><th colspan="6">EJERCICIOS PROPUESTOS</th></tr>
    </theader>
    <tbody>
        <tr><td colspan="6"> PREGUNTA 1
          <ul>
     	     <li> Modificar el método de obtención de valor dado una clave (5 puntos)
		<ul>
		    <li>RESPUESTA</li>
		</ul>             
	     </li>
	  </ul>
	</td></tr>
 	<tr><td colspan="6"> PREGUNTA 2
          <ul>
     	     <li> Mostrar en un diagrama de árbol gráficamente la estructura final para los datos ingresados. (4 puntos)
             <ul>
		  <li>En la siguiente imagen se muestra el arbol B final que se genera a partir de las insercciones anteriores https://ibb.co/txSrMHx.</li>
		  <img src="/Pregunta02_img/BTree.png" width="800" height="200">
		</ul> 
	     </li>
	  </ul>
	</td></tr>
 	<tr><td colspan="6"> PREGUNTA 3
          <ul>
     	     <li>El método toString() del árbol, retorna lo siguiente. ¿Por qué están entre paréntesis ciertas claves? (4 puntos)
                <ul>
		    <li>RESPUESTA...</li>
		</ul> 
             </li>
	  </ul>
	</td></tr>
 	<tr><td colspan="6"> PREGUNTA 4
          <ul>
     	     <li>Mostrar paso a paso el arbol-B al eliminar " www.espn.com" (4 puntos)
                <ul>
		    <li> En la primera parte vemos como tenemos distribuido los elementos del árbol B que tenemos, en la cual se observa
		    en la siguiente imagen:<br>
		    <img src="/Pregunta_4/img/imagen_1.png" width="550" height="300">
		    </li>
		    <li> Luego el elemento que se introduce se le compara con la raíz principal para luego indicar si se elimina el elemento
		    o que camino recorre para seguir buscando al elemento.<br>
		     <img src="/Pregunta_4/img/imagen_2.png" width="550" height="300">
		     </li>
		    <li> Al ver que el valor es mayor que la raíz, se busca por el lado derecho donde se busca en el valores del nodo, 
		    si esta ahí el elemento que deseamos eliminar.<br>
		     <img src="/Pregunta_4/img/imagen_3.png" width="550" height="300">
		     </li>
		     <li> Al no encontrar el elemento bajamos por el primer valor del nodo, ya que el valor que buscamos es menor y al llegar 
		     al siguiente nodo buscamos y se encuentra el valor solicitado.<br> 
		      <img src="/Pregunta_4/img/imagen_4.png" width="550" height="300">
		     </li>
		     <li> Al encontrar el valor se elimnina y en este caso no se hace una redistribución o Fusión de nodos, puesto que el no 
		     es menor a la mitad del grado mínimo.<br>
		      <img src="/Pregunta_5/img/imagen_2.png" width="550" height="300">
		     </li>
		</ul> 
             </li>
	  </ul>
	</td></tr>
 	<tr><td colspan="6"> PREGUNTA 5
          <ul>
     	     <li>Agregar un nodo adicional (www.youtube.com, 134.24.13.78) y mostrarlo paso a paso. (3 puntos)
                 <ul>
		    <li>En esta primera imagen tenemos como esta distribuido el árbol antes de que se inserte el nuevo nodo.
			<img src="/pregunta_5/img/imagen1.jpg" width="550" height="300">
	            </li>
		    <li>Una vez insertado el nodo con clave www.youtube.com se movera hacia el hijo derecho de la raíz para luego 
			moverse a la última clave, aquí nuevamente bajara al hijo derecho de la última clave y se moverá a la última posición.<br>
		        <img src="/pregunta_5/img/imagen2.jpg" width="550" height="300">
	            </li> 
		    <li>Como el máximo de claves que puede haber es 3 (M-1) entonces se divide entre 2 y en este caso el nodo que 
			sube es www.yahoo.com despues www.weather.com pasar a ser un nodo solitario y los nodos www.yales.com y 
			www.youtube.com pasar a ser hijos derechos de www.yahoo.com.Pero ahora el hijo derecho de www.csprinceton.edu tienes 4 claves.
			<img src="/pregunta_5/img/imagen3.jpg" width="550" height="300">
	            </li>
		    <li>Nuevamente se vuelve a dividir y en este caso www.princeton.com  es el que sube a la raíz y www.google.com pasar 
			a ser un nodo único cuyos hijos izquierdo y derecho mantiene, tanto www.slashdot.com y www.yahoo.com mantienen 
			sus hijos izquierdos y derechos.Asi finalmente se ha insertado www.youtube.com. 
			<img src="/pregunta_5/img/imagen4.jpg" width="550" height="300">
	            </li>
		</ul> 
             </li>
	  </ul>
	</td></tr>
        <tr><td colspan="6"> CONCLUSIONES
           <li>El árbol B nos sirve para almacenar grandes cantidades de datos que no caben en la memoria principal, mientras minimiza la cantidad de accesos al disco</li>
	</td></tr>
 </tbody>
</table>

<table>
    <theader>
        <tr><th>RETROALIMENTACIÓN</th></tr>
    </theader>
    <tbody>
         <tr><td colspan="6">                       </td></tr>
    </tbody>
</table>

<table>
    <theader>
        <tr><th>REFERENCIAS Y BIBLIOGRAFIA</th></tr>
    </theader>
    <tbody>
        <tr><td>
            <ul>
                <li>Weiss M., Data Structures & Algorithm Analysis Using Java, 2010, Addison-Wesley.</li>
                <li>Capítulo 4. Representación de conjuntos mediante arboles, Departamento de
Informática y Sistemas Área de Lenguajes y Sistemas, Universidad de Murcia, pag.168</li>
                <li>https://www.cs.usfca.edu/~galles/visualization/BTree.html</li>
                <li>https://ccia.ugr.es/~jfv/ed1/tedi/cdrom/docs/arb_B.htm</li>
            </ul></td>
        </tr>
    </tbody>
</table>
