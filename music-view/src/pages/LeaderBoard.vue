<template>
  <div class="leader-board-album">
    <el-row>
      <div class="album-slide">
          <div class="leader-board-img">
            <img
                :src="listOfSongs[0].pic"
                alt="图片"
            />
          </div>
          <div style="text-align: center">
            <h1 class="leader-board-title">第一名歌曲: {{listOfSongs[0].name}}</h1>
<!--            <h2 class="leader-board-title">第一名歌曲名称: {{listOfSongs[0].name}}</h2>-->
          </div>


      </div>
      <div class="album-content">
        <div class="intro">
          <h2>播放量排名前50的歌曲</h2>
        </div>
        <album-content :song-lists="listOfSongs">
          <template slot="title">歌曲排行榜</template>
        </album-content>
      </div>
    </el-row>


  </div>
</template>

<script>
import { mapGetters } from "vuex";
import { mixins } from "@/mixins";
import AlbumContent from "../components/AlbumContent";

export default {
  name: "LeaderBoard",
  components: { AlbumContent },
  mixins: [mixins],
  computed: {
    ...mapGetters(["id", "listOfSongs"]),
  },
  created() {
    this.getSongByPlayCount();
  },
};
</script>

<style scoped lang="scss">
@import "../assets/css/leader-board";
</style>
