const indicators = document.querySelectorAll('a.indicador');
const resetCurrentActiveIndicator = () => {
  const activeIndicator = document.querySelector(".ativo");
  activeIndicator.classList.remove("ativo");
};

indicators.forEach((indicator) => {
  indicator.addEventListener('click', function () {
    resetCurrentActiveIndicator();
    this.classList.add('ativo');
  });
});

const sections = document.querySelectorAll("section");

const onSectionLeavesViewport = (section) => {
  const observer = new IntersectionObserver(
    (entries) => {
      entries.forEach((entry) => {
        if (entry.isIntersecting) {
          resetCurrentActiveIndicator();
          const element = entry.target;
          const indicator = document.querySelector(`a[href='#${element.id}']`);
          indicator.classList.add("ativo");
          return;
        }
      });
    },
    {
      root: null,
      rootMargin: "0px",
      threshold: 0.75
    }
  );
  observer.observe(section);
};

sections.forEach(onSectionLeavesViewport);