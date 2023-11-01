<template>
  <main>
    <div class="container py-4">

      <div class="p-5 mb-4 bg-body-tertiary rounded-3">
        <div class="container-fluid py-5">
          <h1 class="display-5 fw-bold">Resume application</h1>
          <p class="col-md-8 fs-4">
            This is an application example to handle Resume (CV) data in JSON format.
            Go to 'My Resume' link in navigation bar to check it.
          </p>
          <a href="https://github.com/jdlopez/europass" target="_new" class="btn btn-primary" role="button" ><i class="bi bi-github"></i> GitHub project</a>
        </div>
      </div>

      <div class="row align-items-md-stretch">
        <div class="col-md-6">
          <div class="h-100 p-5 text-bg-dark rounded-3">
            <h2>JSON Resume</h2>
            <p>It uses <a href="https://jsonresume.org/" target="_new">JsonResume</a> schema as a template.</p>
          </div>
        </div>
        <div class="col-md-6">
          <div class="h-100 p-5 bg-body-tertiary border rounded-3">
            <h2>EuroPass</h2>
            <p>EuroPass XML format needs some transformations but it's on the readmap.</p>
            <a href="https://github.com/jdlopez/europass#roadmap" target="_new" class="btn btn-primary" role="button" ><i class="bi bi-github"></i> Check project news</a>
          </div>
        </div>
      </div>

    </div>
  </main>

</template>

<script>
export default {
  computed: {
    year: new Date().getFullYear()
  }
}
</script>