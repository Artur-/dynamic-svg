import { css, svg, LitElement } from "lit-element";

export class FillIndicator extends LitElement {
  static get properties() {
    return { value: {}, fill: { value: "#0f0" } };
  }

  render() {
    return svg`
      <svg style="height: 100px" viewbox="0 0 50 110">
        <rect class="progress"
          transform="rotate(180 10 5) translate(-30 -100)"
          x="10"
          y="5"
          height="${this.value}"
          width="30"
          stroke-width="5"
          stroke="none"
          fill=${this.fill}
        />
        <rect
          class="border"
          x="10"
          y="3"
          rx="2"
          height="100"
          width="30"
          stroke-width="5"
          stroke="black"
          fill="transparent"
        />
      </svg>
    `;
  }
}

customElements.define("fill-indicator", FillIndicator);
