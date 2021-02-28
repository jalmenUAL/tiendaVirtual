import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProductocarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="layoutProductoCarrito">
 <label id="NombreProducto" style="flex-grow: 1; align-self: flex-start; flex-shrink: 1;">Nombre del Producto</label>
 <label id="Cantidad" style="flex-grow: 1; align-self: flex-start;">Cantidad</label>
 <label id="Total" style="flex-grow: 1; align-self: flex-start;">Total</label>
 <vaadin-button theme="primary" id="eliminarCarrito" style="align-self: flex-start;">
  Eliminar
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productocarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductocarrito.is, VistaProductocarrito);
