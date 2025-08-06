<template>
  <div class="container">
    <h1>📝 Notes App</h1>
    <form @submit.prevent="saveNote">
      <input v-model="form.title" placeholder="Title" required />
      <textarea v-model="form.content" placeholder="Content" required></textarea>
      <button type="submit">{{ form.id ? 'Update' : 'Add' }} Note</button>
    </form>
    <ul>
      <li v-for="note in notes" :key="note.id">
        <h3>{{ note.title }}</h3>
        <p>{{ note.content }}</p>
        <button @click="editNote(note)">✏️</button>
        <button @click="deleteNote(note.id)">🗑️</button>
      </li>
    </ul>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const notes = ref([])
const form = ref({ id: null, title: '', content: '' })
const API = 'http://localhost:8080/api/notes'

const fetchNotes = async () => {
  const res = await axios.get(API)
  notes.value = res.data
}

const saveNote = async () => {
  if (form.value.id) {
    await axios.put(`${API}/${form.value.id}`, form.value)
  } else {
    await axios.post(API, form.value)
  }
  form.value = { id: null, title: '', content: '' }
  fetchNotes()
}

const editNote = (note) => {
  form.value = { ...note }
}

const deleteNote = async (id) => {
  await axios.delete(`${API}/${id}`)
  fetchNotes()
}

onMounted(fetchNotes)
</script>

<style>
.container {
  max-width: 600px;
  margin: auto;
  padding: 20px;
}
input, textarea {
  width: 100%;
  margin-bottom: 10px;
}
button {
  margin-right: 5px;
}
</style>