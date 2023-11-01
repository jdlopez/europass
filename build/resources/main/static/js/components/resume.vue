<template>
  <main style="position:relative" data-spy="scroll" data-target="#ScrollNavbar" data-offset="1">
  <div class="container" >
      <div class="text-center">
        <h2>My Resume - Curriculum Vitae</h2>
        <p class="lead">Some explanations about how great is json format to fulfill a resume </p>
      </div>

      <div class="container-fluid">
        <div class="row">
          <div class="col-2">
            <nav id="ScrollNavbar" class="navbar navbar-light">
              <ul class="nav nav-pills flex-column" style="position:fixed"><!-- below main nav -->
                <li class="nav-item">
                  <router-link
                      class="nav-link"
                      :to="{hash:'#secAboutme'}">About me</router-link>
                </li>
                <li class="nav-item">
                  <router-link
                      class="nav-link"
                      :to="{hash:'#secStudies'}">Studies</router-link>
                </li>
                <li class="nav-item">
                  <router-link
                      class="nav-link"
                      :to="{hash:'#secExperience'}">Experience</router-link>
                </li>
                <li class="nav-item">
                  <router-link
                      class="nav-link"
                      :to="{hash:'#secKnowledge'}">Knowledge</router-link>
                </li>
                <li class="nav-item">
                  <router-link
                      class="nav-link"
                      :to="{hash:'#secJob'}">Job</router-link>
                </li>

              </ul>
            </nav>
          </div>
          <div class="col-8">
            <div id="secAboutme">
              <h2>About me</h2>
              <div class="input-group mb-3">
                <span class="input-group-text">Name</span>
                <input type="text" class="form-control" v-model="resume.basics.name" aria-label="name">
                <span class="input-group-text">Surname</span>
                <input type="text" class="form-control" v-model="resume.basics.surname" aria-label="surname">
              </div>
              <!-- email phone url summary location -->
              <div class="mb-3">
                <label for="label" class="form-label">Job title</label>
                <input type="text" class="form-control" id="label" v-model="resume.basics.label"  placeholder="Programmer, architect, manager..." />
              </div>
              <div class="mb-3">
                <img v-if="resume.basics.image !== null" :src="resume.basics.image" width="50" height="50" />
                <label for="avatar" class="form-label">Avatar image</label>
                <input type="url" class="form-control" id="avatar" v-model="resume.basics.image" />
              </div>
              <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" v-model="resume.basics.email"  placeholder="yourname@example.com" />
              </div>
              <div class="mb-3">
                <label for="phone" class="form-label">Phone</label>
                <input type="tel" class="form-control" id="phone" v-model="resume.basics.phone"  placeholder="XX-XXXXXSXXX" />
              </div>
              <div class="mb-3">
                <label for="homepage" class="form-label">Personal homepage</label>
                <input type="url" class="form-control" id="homepage" v-model="resume.basics.url" placeholder="https://about.me/yourname" />
              </div>
              <div class="mb-3">
                <label for="summary" class="form-label">Summary</label>
                <textarea v-model="resume.basics.summary" class="form-control" id="summary" rows="3"></textarea>
              </div>
            </div>
            <div id="secStudies">
              <h2>Studies</h2>
              <div class="mb-3">
                <ul class="list-group">
                  <li class="list-group-item active" aria-current="true">
                    Languages <a @click="this.dialogs.addLanguage=true" title="Add language"><i class="bi bi-plus-circle"></i></a>
                  </li>
                  <li class="list-group-item" v-for="l in this.resume.languages">
                    {{l.language}} - {{l.fluency}} <a @click="removeLanguage(l.language)" title="Delete language"><i class="bi bi-trash"></i></a>
                  </li>
                  <div class="mb-3" v-if="this.dialogs.addLanguage">
                    <label for="language" class="form-label">New language</label>
                    <input class="form-control" v-model="this.dialogs.language.language" list="langOptions" id="language" placeholder="Type to search...">
                    <datalist id="langOptions">
                      <option v-for="l in this.lists.languages" value="{{l.name}}" />
                    </datalist>
                    <select class="form-select" aria-label="Level" v-model="this.dialogs.language.fluency">
                      <option v-for="lvl in this.lists.languageLevel" value="lvl">{{lvl}}</option>
                    </select>
                    <button @click="addLanguage"><i class="bi bi-plus-circle"></i> Add</button>
                  </div>
              </div>
            </div>
            <div id="secExperience">
              <h2>Experience</h2>
            </div>
            <div id="secKnowledge">
              <h2>Knowledge</h2>
            </div>
            <div id="secJob">
              <h2>Job</h2>
            </div>

        </div>
      </div>
    </div>
  </main>
</template>

<script>

export default {
  data () {
    return {
      resume: {
        basics: {},
        languages: []
      },
      lists: {
        skillLevel: [],
        languageLevel: [],
        languages: [],
        skillTypes: []
      },
      dialogs: {
        addLanguage: false,
        language: {}
      },
    }
  },
  methods: {
    addLanguage() {
      this.resume.languages.push(this.dialogs.language);
      this.dialogs.language = {};
      this.dialogs.addLanguage = false;
    },
    removeLanguage(name) {
      this.resume.languages = this.resume.languages.filter(item => item.language !== name);
    }
  },
  async created() {
    this.lists.skillLevel = getList("skill-level");
    this.lists.languageLevel =  getList("language-level");
    this.lists.languages = getList("languages");
    this.lists.skillTypes = getList("skills");
    /*
    axios
        .get('/expediente/actuaciones?exp=' + this.$route.params.id)
        .then(response => (this.actuaciones = response.data));

     */
  }
}
</script>
