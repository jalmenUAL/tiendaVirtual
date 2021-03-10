import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutProducto">
 <img id="imagenProducto" style="flex-grow: 1; align-self: stretch; width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="pieProducto" style="align-self: stretch;">
  <vaadin-button theme="primary" id="anadirCarrito" style="flex-grow: 1;">
    Añadir a Carrito 
  </vaadin-button>
  <vaadin-button id="anadirOferta" style="flex-grow: 1;">
    Añadir a Oferta 
  </vaadin-button>
  <vaadin-button theme="primary success" id="quitarOferta">
    Quitar de Oferta 
  </vaadin-button>
  <label id="labelPrecio" style="flex-grow: 1;">Precio</label>
  <label id="precioProducto" style="flex-grow: 1;">Euros</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
