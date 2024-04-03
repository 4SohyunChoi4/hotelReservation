
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PointPointManager from "./components/listers/PointPointCards"
import PointPointDetail from "./components/listers/PointPointDetail"

import ReserveReserveManager from "./components/listers/ReserveReserveCards"
import ReserveReserveDetail from "./components/listers/ReserveReserveDetail"

import NotifyNotifyManager from "./components/listers/NotifyNotifyCards"
import NotifyNotifyDetail from "./components/listers/NotifyNotifyDetail"

import CleanCleanManager from "./components/listers/CleanCleanCards"
import CleanCleanDetail from "./components/listers/CleanCleanDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/points/points',
                name: 'PointPointManager',
                component: PointPointManager
            },
            {
                path: '/points/points/:id',
                name: 'PointPointDetail',
                component: PointPointDetail
            },

            {
                path: '/reserves/reserves',
                name: 'ReserveReserveManager',
                component: ReserveReserveManager
            },
            {
                path: '/reserves/reserves/:id',
                name: 'ReserveReserveDetail',
                component: ReserveReserveDetail
            },

            {
                path: '/notifies/notifies',
                name: 'NotifyNotifyManager',
                component: NotifyNotifyManager
            },
            {
                path: '/notifies/notifies/:id',
                name: 'NotifyNotifyDetail',
                component: NotifyNotifyDetail
            },

            {
                path: '/cleans/cleans',
                name: 'CleanCleanManager',
                component: CleanCleanManager
            },
            {
                path: '/cleans/cleans/:id',
                name: 'CleanCleanDetail',
                component: CleanCleanDetail
            },



    ]
})
