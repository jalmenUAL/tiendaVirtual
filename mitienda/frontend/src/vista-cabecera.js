import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaCabecera extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="cabecera">
 <vaadin-button id="buscar">
   Buscar 
 </vaadin-button>
 <vaadin-text-field placeholder="Search" id="busqueda" style="flex-grow: 1; align-self: flex-start;">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
 <vaadin-button id="login">
   Login 
 </vaadin-button>
 <vaadin-button id="verCarrito">
   Ver Carrito 
 </vaadin-button>
 <vaadin-button id="salir">
   Salir 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-cabecera';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCabecera.is, VistaCabecera);
