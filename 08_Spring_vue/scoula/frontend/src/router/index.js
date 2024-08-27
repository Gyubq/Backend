import { createRouter, createWebHistory } from 'vue-router';

import authRotes from './auth';
import boardRotes from './board';
import travelRoutes from './travel';
import galleryRoutes from './gallery';
import HomePage from '../pages/HomePage.vue';
import memoRoutes from './memo';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage,
    },
    // 배열의 펼침연산자이다
    // 이게없다면 위에 임포트가 연결이안됨 . 라우터 이름이달라서?
    ...authRotes,
    ...boardRotes,
    ...travelRoutes,
    ...galleryRoutes,
    ...memoRoutes,
  ],
});

export default router;
