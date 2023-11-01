<template>
  <!-- style="position:relative" data-spy="scroll" data-target="#ScrollNavbar" data-offset="1" -->
  <main >
  <div class="container" >
      <div class="text-center" id="top">
        <h2>My Resume - Curriculum Vitae</h2>
        <p class="lead">Some explanations about how great is json format to fulfill a resume </p>
        <button class="btn btn-outline-secundary" @click="exportJson"><i class="bi bi-save"></i> Export as JSON</button>
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-outline-secundary" data-bs-toggle="modal" data-bs-target="#loadDialog">
          <i class="bi bi-box-arrow-up"></i> Load JSON file
        </button>

        <!-- Modal -->
        <div class="modal fade" id="loadDialog" tabindex="-1" aria-labelledby="loadDialogLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h1 class="modal-title fs-5" id="loadDialogLabel">Load RESUME</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                <input type="file" id="input" />
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" data-bs-dismiss="modal" @click="loadJsonResumeFile()">Load</button>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="container-fluid">
        <div class="row">
          <div class="col-2">
            <nav id="ScrollNavbar" class="navbar sticky-top">
              <ul class="nav flex-column " ><!--style="position:fixed below main nav -->
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
              <h2>About me
              <span class="fs-4"><router-link  :to="{hash:'#top'}" title="top"><i class="bi bi-chevron-double-up"></i></router-link></span>
              </h2>
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
                <img v-if="resume.basics.image != null" :src="resume.basics.image" width="50" height="50" />
                <label for="avatar" class="form-label">Avatar image</label>
                <input type="url" class="form-control" id="avatar" v-model="resume.basics.image" />
              </div>
              <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" v-model="resume.basics.email"  placeholder="yourname@example.com" />
              </div>
              <div class="mb-3">
                <label for="phone" class="form-label">Phone</label>
                <input type="tel" class="form-control" id="phone" v-model="resume.basics.phone"  placeholder="XX-XXXXXXXXX" />
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
              <h2>Studies
                <span class="fs-4"><router-link  :to="{hash:'#top'}" title="top"><i class="bi bi-chevron-double-up"></i></router-link></span>
              </h2>
              <education-list v-model="resume.education"></education-list>

              <certificate-list v-model="resume.certificates"></certificate-list>

              <language-list v-model="resume.languages"></language-list>

            </div><!-- studies -->
            <div id="secExperience">
              <h2>Experience
                <span class="fs-4"><router-link  :to="{hash:'#top'}" title="top"><i class="bi bi-chevron-double-up"></i></router-link></span>
              </h2>
              <work-list v-model="resume.work"></work-list>

            </div><!-- experience -->
            <div id="secKnowledge">
              <h2>Knowledge
                <span class="fs-4"><router-link  :to="{hash:'#top'}" title="top"><i class="bi bi-chevron-double-up"></i></router-link></span>
              </h2>
              <skill-list v-model="resume.skills"></skill-list>
              <project-list v-model="resume.projects"></project-list>
            </div><!-- knowledge -->
            <div id="secJob">
              <h2>Job
                <span class="fs-4"><router-link  :to="{hash:'#top'}" title="top"><i class="bi bi-chevron-double-up"></i></router-link></span>
              </h2>
              <div class="mb-3">
                <label for="jobTitle" class="form-label">Job Title</label>
                <input type="text" class="form-control" id="jobTitle" v-model="resume.job.jobTitle"  placeholder="Definition of the job" />
              </div>
              <div class="mb-3">
                <label for="jobAboutMe" class="form-label" title="A brief description of my interest in the job">About me</label>
                <textarea v-model="resume.job.aboutMe" class="form-control" id="jobAboutMe" rows="3"></textarea>
              </div>

              <div class="mb-3">
                <label for="jobPublication" class="form-label">Job Publication URL</label>
                <input type="url" class="form-control" id="jobPublication" v-model="resume.job.jobPublication" placeholder="https://job.company/job-position" />
              </div>

            </div><!-- job -->

          </div>
        </div><!-- row -->
      </div>
    </div>
  </main>
</template>

<script>
function downloadObjectAsJson(exportObj, exportName){
  var dataStr = "data:text/json;charset=utf-8," + encodeURIComponent(JSON.stringify(exportObj));
  var downloadAnchorNode = document.createElement('a');
  downloadAnchorNode.setAttribute("href",     dataStr);
  downloadAnchorNode.setAttribute("download", exportName + ".json");
  document.body.appendChild(downloadAnchorNode); // required for firefox
  downloadAnchorNode.click();
  downloadAnchorNode.remove();
}
export default {
  components: {
    LanguageList: Vue.defineAsyncComponent(() => loadModule('./js/components/language.vue', options)),
    CertificateList: Vue.defineAsyncComponent(() => loadModule('./js/components/certification.vue', options)),
    EducationList: Vue.defineAsyncComponent(() => loadModule('./js/components/education.vue', options)),
    WorkList: Vue.defineAsyncComponent(() => loadModule('./js/components/work.vue', options)),
    ProjectList: Vue.defineAsyncComponent(() => loadModule('./js/components/project.vue', options)),
    SkillList: Vue.defineAsyncComponent(() => loadModule('./js/components/skills.vue', options))
  },
  data () {
    return {
      resume: {
        basics: {},
        languages: [],
        certificates: [],
        awards: [],
        education: [],
        work: [],
        projects: [],
        skills: [],
        job: {}
      }
    }
  },
  methods: {

    addEducation() {
      this.resume.education.push(this.dialogs.education);
      this.dialogs.education = {};
      this.dialogs.addEducation = false;
    },
    removeItemEdu(index) {
      this.resume.education.splice(index, 1);
    },
    exportJson() {
      downloadObjectAsJson(this.resume, "my-resume");
    },
    loadJsonResumeFile() {

      const file = document.querySelector("input[type=file]").files[0];
      const reader = new FileReader();

      reader.addEventListener(
          "load",
          () => {
            let loadedResume = JSON.parse( reader.result );
            if (loadedResume != null) {
              // check for needed init values
              if (loadedResume.job == null) {
                loadedResume.job = {};
              }
              if (loadedResume.basics == null) {
                loadedResume.basics = {};
              }
              if (loadedResume.languages == null) {
                loadedResume.languages = new Array();
              }
              if (loadedResume.certificates == null) {
                loadedResume.certificates = new Array();
              }
              if (loadedResume.awards == null) {
                loadedResume.awards = new Array();
              }
              if (loadedResume.education == null) {
                loadedResume.education = new Array();
              }
              if (loadedResume.work == null) {
                loadedResume.work = new Array();
              }
              if (loadedResume.projects == null) {
                loadedResume.projects = new Array();
              }
              if (loadedResume.skills == null) {
                loadedResume.skills = new Array();
              }

              this.resume = loadedResume;
            } else {
              console.log("show some error!!");
            }

          },
          false,
      );

      if (file) {
        reader.readAsText(file);
      }
    }
  },
  async beforeCreate() {

  }
}
</script>
