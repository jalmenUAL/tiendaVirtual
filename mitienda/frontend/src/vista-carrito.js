import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="vaadinVerticalLayout">
 <label id="labelCarrito" style="align-self: stretch;">Carrito</label>
 <vaadin-horizontal-layout theme="spacing" id="layoutTotal" style="align-self: stretch;">
  <label id="labelTotal" style="align-self: stretch; flex-grow: 1;">Total de Compra</label>
  <label id="totalCarrito" style="flex-grow: 1;">Cantidad</label>
  <vaadin-button id="cerrarCarrito">
   Cerrar Carrito
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-carrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCarrito.is, VistaCarrito);
