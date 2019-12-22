package com.lsy.myscala.traffic

/**
  * Created by lisiyu on 2018/5/8.
  */

// cityordergps trail format
case class TrailPoint(
                       timestamp: String,
                       longitude: String,
                       latitude: String,
                       link_ids: String,
                       link_distance: String,
                       map_longitude: String,
                       map_latitude: String,
                       point_speed: String,
                       line_speed: String,
                       possibility: String,
                       current_link_id: String
                     )

// order original data format from bi hive table
case class Order(
                  order_id: String,
                  driver_id: String,
                  begin_charge_time: String,
                  finish_time: String,
                  s_lon: String,
                  s_lat: String,
                  e_lon: String,
                  e_lat: String,
                  city_id: String
                )

// trail with order
case class OrderMatchTrail(
                             driver_id: String,
                             roadnet_version: String,
                             ts: String,
                             lon: String,
                             lat: String,
                             links: String,
                             distance: String,
                             mm_lon: String,
                             mm_lat: String,
                             p_speed: String,
                             l_speed: String,
                             possibility: String,
                             link: String,
                             s_lon: String,
                             s_lat: String,
                             e_lon: String,
                             e_lat: String,
                             s_ts: String,
                             e_ts: String,
                             city_id: String,
                             order_id: String
                           )
// trails with order
case class OrderLinksTrails(
                             driver_id: String,
                             roadnet_version: String,
                             trail_list: List[String],
                             s_lon: String,
                             s_lat: String,
                             e_lon: String,
                             e_lat: String,
                             s_ts: String,
                             e_ts: String,
                             city_id: String,
                             order_id: String
                           )
case class OrderLinksTrailsStr(
                             driver_id: String,
                             roadnet_version: String,
                             trail_list: String,
                             s_lon: String,
                             s_lat: String,
                             e_lon: String,
                             e_lat: String,
                             s_ts: String,
                             e_ts: String,
                             city_id: String,
                             order_id: String
                           )
// order data
//case class OrderTraj(
//                      driver_id: String,
//                      roadnet_version: String,
//                      trail_list: String,
//                      s_lon: String,
//                      s_lat: String,
//                      e_lon: String,
//                      e_lat: String,
//                      s_ts: String,
//                      e_ts: String,
//                      city_id: String,
//                      order_id: String
//                    )

