<template>

    <v-card outlined>
        <v-card-title>
            MyPage # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="RoomrId" v-model="item.roomrId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="ReserveId" v-model="item.reserveId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ReserveStatus" v-model="item.reserveStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CleanStatus" v-model="item.cleanStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MyPageViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/myPages/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

