<template>
  <div id="app">
	<b-navbar toggleable="md"  ><!-- type="dark" variant="success" type="light" -->

	<b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

	<b-navbar-brand href="#">NavBar</b-navbar-brand>

	<b-collapse is-nav id="nav_collapse">

	<b-navbar-nav>
	<b-nav-item href="#">My CV</b-nav-item>
	<!--
	<b-nav-item href="#" disabled>Disabled</b-nav-item>
	-->
	</b-navbar-nav>

	<!-- Right aligned nav items -->
	<b-navbar-nav class="ml-auto">

	<!--
	<b-nav-form>
	<b-form-input size="sm" class="mr-sm-2" type="text" placeholder="Search"/>
	<b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
	</b-nav-form>

	<b-nav-item-dropdown text="Lang" right>
	<b-dropdown-item href="#">EN</b-dropdown-item>
	<b-dropdown-item href="#">ES</b-dropdown-item>
	<b-dropdown-item href="#">RU</b-dropdown-item>
	<b-dropdown-item href="#">FA</b-dropdown-item>
	</b-nav-item-dropdown>
-->
	<b-nav-item-dropdown right>
	<!-- Using button-content slot -->
	<template slot="button-content">
	  <em>User</em>
	</template>
	<b-dropdown-item href="#">Profile</b-dropdown-item>
	<b-dropdown-item href="#">Signout</b-dropdown-item>
	</b-nav-item-dropdown>
	</b-navbar-nav>

	</b-collapse>
	</b-navbar>

	<!-- navbar-1.vue -->
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0px;
}
</style>
